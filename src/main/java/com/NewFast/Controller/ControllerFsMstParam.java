package com.NewFast.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.NewFast.Models.FsMstParam;
import com.NewFast.Services.ServiceFsMstParam;


@RestController
public class ControllerFsMstParam {
	@Autowired
	ServiceFsMstParam ServFMPRM;
	
	@GetMapping("/params/getParamByKey")
	public List<FsMstParam> getParamByKey(String keyin){
		//System.out.println("aaaa :"+keyin);
		return ServFMPRM.getParamByKey(keyin);
	}
	
	

}
