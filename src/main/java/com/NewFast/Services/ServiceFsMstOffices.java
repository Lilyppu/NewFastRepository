package com.NewFast.Services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NewFast.Models.FsMstOffices;
import com.NewFast.Repository.IFsMstOfficesRepository;

@Service
public class ServiceFsMstOffices {
	@Autowired
	IFsMstOfficesRepository repoFMOFF;
	
	public List<FsMstOffices> getFmOffList(){
		return repoFMOFF.findAll();
	}
	
	public Optional<FsMstOffices> getOfficeName(String off){
		return repoFMOFF.findByFmofCode(off);
	}
	
	
}
