package com.NewFast.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NewFast.Models.FsUtlJobSchedules;
import com.NewFast.Repository.IFsUtlJobSchedulesRepository;

@Service
public class ServiceFsUtlJobSchedules {
	@Autowired
	IFsUtlJobSchedulesRepository repoFujs;
	
	public List<FsUtlJobSchedules> getFujsAll  (String Status, Integer ModId){
		return repoFujs.findBYFujsStatusFlagAndFujsModuleId(Status, ModId);
	}
	
}
