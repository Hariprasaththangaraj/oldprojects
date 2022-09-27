package com.server.main.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.main.user.bean.teamDetails;

@Repository
public interface DAORepository extends JpaRepository<teamDetails, Integer>{
	
	}
