package com.Service;

import org.springframework.stereotype.Service;

@Service
public class AuthTokenService {

	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
	public String generateToken() 
	{
		int count=16;
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) 
		{
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
	
}
