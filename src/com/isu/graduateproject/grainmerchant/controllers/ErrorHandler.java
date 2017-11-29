package com.isu.graduateproject.grainmerchant.controllers;

import java.nio.file.AccessDeniedException;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ErrorHandler {
	
	public String handleDatabaseException(DataAccessException dae){
		dae.printStackTrace();
		return "dberror";
	}
	
	public String handleAccessDeniedException(AccessDeniedException ade){
		ade.printStackTrace();
		return "accessdenied";
	}

}
