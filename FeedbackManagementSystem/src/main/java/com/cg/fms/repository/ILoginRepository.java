package com.cg.fms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entity.Login;

@Repository
public interface ILoginRepository extends JpaRepository<Login,String>{
	
	public Login findByUserName(String username);
}