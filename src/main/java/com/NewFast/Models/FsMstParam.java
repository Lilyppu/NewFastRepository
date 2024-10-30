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
@Table(name = "FS_MST_PARAM")
@IdClass(FsMstParamCompKey.class)
public class FsMstParam {

	@Id
	@Column(name="MODULE_ID")
	private Integer fmprModuleId;
	
	@Id
	@Column(name="KEY", length=100)
	private String fmprKey;
	
	@Id
	@Column(name="VALUE", length=1000)
	private String fmprValue;
	
	@Column(name="NOTES", length=200)
	private String fmprNotes;
	
	@Column(name="STARTED_TIMESTAMP")
	private Date fmprStartedTimestamp;
	
	@Column(name="CREATED_BY", length=15)
	private String fmprCreateBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date fmprCreatedTimestamp;
	
	@Column(name="LASTUPDATE_BY", length=15)
	private String fmprUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date fmprUpdateTimestamp;
	
	@Column(name="ID")
	private Integer fmprId;
	

}
