package com.javatpoint.server.main.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.user.modelresponse.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer>{

}
