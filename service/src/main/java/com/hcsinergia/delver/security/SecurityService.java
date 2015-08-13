package com.hcsinergia.delver.security;


public interface SecurityService {
	
	void validateUserPassword(String user, String password);
}
