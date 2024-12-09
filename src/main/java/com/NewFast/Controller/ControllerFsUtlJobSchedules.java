package com.NewFast.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.NewFast.Models.FsUtlJobSchedules;
import com.NewFast.Services.ServiceFsUtlJobSchedules;


@RestController
public class ControllerFsUtlJobSchedules {
	@Autowired
	ServiceFsUtlJobSchedules servFujs;
	
	@GetMapping("/fujs/getFsUtlJobScheduleList")
	public List<FsUtlJobSchedules> getFujsAll  (String Status, Integer ModId){
		return servFujs.getFujsAll(Status, ModId);
	}
	
	@GetMapping("/fujs/getFsUtlJobScheduleSingle")
	public Optional<FsUtlJobSchedules> getFujsSingle  (String Name){
		return servFujs.getFujsSingle(Name);
	}
	
	@GetMapping("/fujs/getFsUtlJobScheduleFilter")
	public  List<FsUtlJobSchedules> getFujsFilter(String ptype, String pstatus, String pdate){
		return servFujs.getFujsFilter(ptype, pstatus, pdate);
	}
}
