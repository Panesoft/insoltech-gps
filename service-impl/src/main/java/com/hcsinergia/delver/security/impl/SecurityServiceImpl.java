package com.hcsinergia.delver.security.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;

import com.hcsinergia.delver.security.SecurityService;

@Service
public class SecurityServiceImpl implements SecurityService{
	
	@Autowired
	public DriverManagerDataSource dataSource;
	
	public void validateUserPassword(String user, String password) {
		dataSource.setUsername(user);
		dataSource.setPassword(password);
	}
}
