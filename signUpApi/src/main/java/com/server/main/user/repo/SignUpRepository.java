package com.server.main.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.main.user.responseDTO.SignUpResponse;

@Repository
public interface SignUpRepository extends JpaRepository<SignUpResponse, Long> {

}
