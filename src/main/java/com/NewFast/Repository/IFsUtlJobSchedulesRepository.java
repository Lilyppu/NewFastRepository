package com.NewFast.Repository;
import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;


import com.NewFast.Models.FsUtlJobSchedules;

@Repository
public interface IFsUtlJobSchedulesRepository extends JpaRepository<FsUtlJobSchedules, String>{
	
	List<FsUtlJobSchedules> findByFujsStatusFlagAndFujsModuleId (String Status, Integer ModId);
	
	Optional<FsUtlJobSchedules> findByFujsName (String Name);
	
	@Query(value="SELECT AA.* "
			+ "FROM FS_UTL_JOB_SCHEDULES AA "
			+ "WHERE MODULE_ID=3 "
			+ "and JOB_TYPE LIKE '%'||:PTYPE||'%' "
			+ "AND STATUS_FLAG LIKE '%'||:PSTATUS||'%' "
			+ "AND TO_CHAR(CREATED_TIMESTAMP,'DD/MM/YYYY') LIKE '%'||:PDATE||'%' ", nativeQuery = true )
    List<FsUtlJobSchedules> getFujsFilter(String PTYPE, String PSTATUS, String PDATE);

}
