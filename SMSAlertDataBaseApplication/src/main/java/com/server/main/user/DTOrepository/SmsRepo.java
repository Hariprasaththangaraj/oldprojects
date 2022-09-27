package com.server.main.user.DTOrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.main.user.response.SmsResponse;

@Repository
public interface SmsRepo extends JpaRepository<SmsResponse, Integer> {

}
