package com.NewFast.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FS_UTL_JOB_SCHEDULES")

public class FsUtlJobSchedules {
	
	@Id
	@Column(name="JOB_NAME",length=50,  nullable = false)
	private String fujsName;
	
	@Column(name="DESCRIPTION",length=500)
	private String fujsDescription;
	
	@Column(name="WHAT",length=2000)
	private String fujsWhat;
	
	@Column(name="MODULE_ID")
	private Integer fujsModuleId;
	
	@Column(name="JOB_TYPE",length=30)
	private String fujsJobType;
	
	@Column(name="STATUS_FLAG",length=2)
	private String fujsStatusFlag;
	
	@Column(name="REMARKS",length=2000)
	private String fujsRemark;
	
	@Column(name="REFERENCE_NO",length=50)
	private String fujsReffrenceNo;
	
	@Column(name="JOB_START")
	private Date fujsJobStart;
	
	@Column(name="JOB_FINISH")
	private Date fujsJobFinish;
	
	@Column(name="RETURN_FILE",length=2)
	private String fujsReturnFile;
	
	@Column(name="LAST_RERUN_BY",length=15)
	private String fujsLastRerunBy;
	
	@Column(name="LAST_RERUN_TIMESTAMP")
	private Date fujsRerunTimestamp;
	
	@Column(name="STARTED_TIMESTAMP")
	private Date fujsStartedTimestamp;
	
	@Column(name="EMAIL_ADDRESS",length=100)
	private String fujsEmailAddress;
	
	@Column(name="EMAIL_SUBJECT",length=100)
	private String fujsEmailSubject;

	@Column(name="EMAIL_NOTE",length=2000)
	private String fujsEmailNote;
	
	@Column(name="ATTACH_FILES",length=2000)
	private String fujsAttachFile;
	
	@Column(name="CREATED_BY",length=15)
	private String fujsCreatedBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date fujsCreatedTimestamp;    
	

}
