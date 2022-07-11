package com.project.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class PathAllocationService {
public <T> ResponseEntity<T> passThrough(HttpServletRequest request){
	String targetPath=setTargetPath(request);
	return null;
}

private String setTargetPath(HttpServletRequest request) {
	var x=request.getContextPath().length();
	var y=request.getContextPath();
	String servletPath=request.getRequestURI()
			.substring(request.getContextPath().length());
	String initialPath = servletPath.split("/", 4)[2];
	
	return null;
}
}
