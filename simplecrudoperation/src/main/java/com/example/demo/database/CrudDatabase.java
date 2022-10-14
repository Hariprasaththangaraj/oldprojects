package com.example.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CrudRequestDto;

@Repository
public interface CrudDatabase extends JpaRepository<CrudRequestDto, Integer>{

}
