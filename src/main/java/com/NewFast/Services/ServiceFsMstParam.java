package com.NewFast.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NewFast.Models.FsMstParam;
import com.NewFast.Repository.IFsMstParamRepository;

@Service
public class ServiceFsMstParam {
	@Autowired
	IFsMstParamRepository repoFMPRM;
	 
	public List<FsMstParam> getParamByKey(String keyin){
		
		return repoFMPRM.findByFmprKeyContaining(keyin);
	}

}
