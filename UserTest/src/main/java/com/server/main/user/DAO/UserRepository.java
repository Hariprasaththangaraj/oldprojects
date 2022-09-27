package com.server.main.user.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.main.user.ResponseModel.UserDAO;

@Repository
public interface UserRepository extends JpaRepository<UserDAO, Integer>{

}
