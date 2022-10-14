package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.database.CrudDatabase;
import com.example.demo.entity.CrudRequestDto;
import com.example.demo.entity.CrudResponseDto;

@Service
public class CrudService {

	CrudDatabase crudDatabase;

	public void serviceSaveMethod(CrudResponseDto crudResponseDto) {
		// TODO Auto-generated method stub
		CrudRequestDto request = new CrudRequestDto();
		request.setName(crudResponseDto.getName());
		request.setPhoneNumber(crudResponseDto.getPhoneNumber());

		crudDatabase.save(request);

	}

}
