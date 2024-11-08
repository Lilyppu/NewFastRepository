package com.NewFast.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.NewFast.Models.FsMstCompany;
import com.NewFast.Services.ServiceFsMstCompany;

@RestController
public class ControllerFsMstCompany {
	@Autowired
	ServiceFsMstCompany servFMCO;
	
	@GetMapping("/company/getFmcoList")
	public List<FsMstCompany> getCompanyList (){
		return servFMCO.getCompanyList();
	}
	
	@GetMapping("/company/getFmcoSingle")
	public Optional<FsMstCompany> getCompanySingle (String coyid){
		return servFMCO.getCompanySingle(coyid);
	}
}
