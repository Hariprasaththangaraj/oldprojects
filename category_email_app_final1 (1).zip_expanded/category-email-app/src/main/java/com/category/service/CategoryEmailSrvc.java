package com.category.service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Optional;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.category.model.Category;
import com.category.model.CategoryList;
import com.category.model.CategoryRequest;
import com.category.model.PersonalDetail;
import com.category.model.Response;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CategoryEmailSrvc {
	
	@Value("${app.category.path}")
	private String categoryFilePath;
	
	@Value("${app.template.path}")
	private String templateFilePath;
	
	@Autowired
    private JavaMailSender mailSender;
	
	public Response categoryEmail(CategoryRequest categoryRequest) throws Exception
	{
		Response response = null;
		try 
		{
			ObjectMapper objectMapper = new ObjectMapper();
			CategoryList categoryList = objectMapper.readValue(Paths.get(categoryFilePath).toFile(), CategoryList.class);
			if(!Objects.isNull(categoryList)) 
			{
				Optional<Category> category = categoryList.getCategoryList().stream().filter(data -> data.getId() == categoryRequest.getId()).findFirst();
				if(category.isPresent()) 
				{
					sendMail(categoryRequest, category.get());
					response = new Response("SUCCESS");
				}
			}
			else 
			{
				throw new RuntimeException();
			}
		} 
		catch (Exception ex) 
		{
			throw ex;
		}
		return response;
	}

	private void sendMail(CategoryRequest categoryRequest, Category category) throws MessagingException, IOException 
	{	
		JavaMailSenderImpl jMailSender = (JavaMailSenderImpl) mailSender;
		jMailSender.setUsername(category.getEmail().getUsername());
		jMailSender.setPassword(category.getEmail().getPassword());
		jMailSender.setHost(category.getEmail().getHost());
		jMailSender.setPort(category.getEmail().getPort());
		javax.mail.internet.MimeMessage mimeMessage = jMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);

        helper.setFrom(category.getEmail().getFrom());
        helper.setSubject(category.getEmail().getSubject());
        
    	byte[] encoded = Files.readAllBytes(Paths.get(templateFilePath + category.getEmail().getTemplate()));
    	
        for(PersonalDetail detail : categoryRequest.getPersonalDetails()) 
        {
            String html = new String(encoded, StandardCharsets.US_ASCII);
        	html = html.replace("username", detail.getUsername()).replace("phonenumber", detail.getPhoneNumber());
            helper.setText(html, true);
            helper.setTo(detail.getEmailId());
            jMailSender.send(mimeMessage);
        }
        
	}
}
