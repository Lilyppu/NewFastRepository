package com.NewFast.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.NewFast.Models.FsMstOffices;
import com.NewFast.Services.ServiceFsMstOffices;


@RestController
public class ControllerFsMstOffices {
	@Autowired
	ServiceFsMstOffices servFMOFF;
	
	@GetMapping("/ofice/getFmofList")
	public List<FsMstOffices> getFmOffList(){
		return servFMOFF.getFmOffList();
	}
	
	@GetMapping("/ofice/getFmofSingle")
	public Optional<FsMstOffices> getOfficeName(String off){
		return servFMOFF.getOfficeName(off);
	}
	

}
