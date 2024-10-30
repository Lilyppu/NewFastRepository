package com.NewFast.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NewFast.Models.FsMstCompany;
import com.NewFast.Repository.IFsMstCompanyRepository;


@Service
public class ServiceFsMstCompany {
	@Autowired
	IFsMstCompanyRepository repoFMCO;
	
	public Optional<FsMstCompany> getCompanySingle (String coyid){
		return repoFMCO.findByFmcoCoyId(coyid);
	}

}
