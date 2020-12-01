package com.cg.trainee.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

@Service
public class MapValidationErrorService {

	public ResponseEntity<?> mapvalidationError(BindingResult result) {
		 if(result.hasErrors()) {
    		 Map<String,String> errorMap=new HashMap<>();
    		 for(FieldError filederror:result.getFieldErrors()) {
    			 errorMap.put(filederror.getField(),filederror.getDefaultMessage());
    		 }
    		 return new ResponseEntity<Map<String,String>>(errorMap,HttpStatus.BAD_REQUEST);
    	 }
		return null;
	}

	
}

