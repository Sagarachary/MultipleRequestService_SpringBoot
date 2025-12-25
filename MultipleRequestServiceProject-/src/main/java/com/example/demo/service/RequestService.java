package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class RequestService {
	public String generateMessage(String fname, String mname, String lname) {
		return "Hello "+fname+" "+mname+" "+lname+" Welcome to kodnest";
	}
}
