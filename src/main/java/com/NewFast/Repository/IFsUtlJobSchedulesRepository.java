package com.NewFast.Repository;
import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.NewFast.Models.FsUtlJobSchedules;

public interface IFsUtlJobSchedulesRepository extends JpaRepository<FsUtlJobSchedules, String>{
	
	public List<FsUtlJobSchedules> findBYFujsStatusFlagAndFujsModuleId (String Status, Integer ModId);

}
