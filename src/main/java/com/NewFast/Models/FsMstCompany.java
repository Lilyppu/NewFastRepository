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
@Table(name = "FS_MST_COMPANY")
public class FsMstCompany {
	
	@Id
	@Column(name="COY_ID",length=5,  nullable = false)
	private String fmcoCoyId;
	
	@Column(name="COY_NAME",length=50,  nullable = false)
	private String fmcoCoyName;	
	
	@Column(name="SEGMENT_COY",length=2)
	private String fmcoSegmentCoy;
	
	@Column(name="SET_OF_BOOK_ID",length=15)
	private String fmcoSetOfBook;
	
	@Column(name="CREATE_BY",length=15)
	private String fmcoCreateBy;	
		
	@Column(name="SEGMENT_NO")
	private Integer fmcoSegmentNo;
	
	@Column(name="NAME_SHORT",length=50)
	private String fmcoNameShort;
	
	@Column(name="PREF_JE_CATEGORY",length=2)
	private String fmcoPrefJeCategory;
	
	@Column(name="DEFAULT_PLATFORM",length=2)
	private String fmcoDefaultPlatform;	
	
	@Column(name="UPDATE_BY",length=15)
	private String fmcoUpdateBy;
	      
	@Column(name="STARTED_TIMESTAMP")
	private Date fmcoStartedTime;
	
	@Column(name="CREATE_DATE")
	private Date fmcoCreateDate;
	
	@Column(name="UPDATE_DATE")
	private Date fmcoUpdateDate;

	        
	  


}
