package com.server.main.user.userDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.main.user.userResponse.userResponseData;

@Repository
public interface userDatabase extends JpaRepository<userResponseData, Integer>{

}
