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
@Table(name = "FS_MST_OFFICES")
public class FsMstOffices {
	
	@Id
	@Column(name="OFFICE_CODE",length=5,  nullable = false)
	private String fmofCode;

	@Column(name="NAME_SHORT",length=50)
	private String fmofNameShort;
	
	@Column(name="NAME_FULL",length=100)
	private String fmofNameFull;
	
	@Column(name="REGIONAL_ID",length=5)
	private String fmofRegionalId;
	
	@Column(name="OFFICE_CODE_REP",length=5)
	private String fmofCoderep;
	
	@Column(name="OFFICE_TYPE",length=3)
	private String fmofType;
	
	@Column(name="COLL_INCENTIVE")
	private Integer fmofCollIncentive;
	
	@Column(name="POSITION_CODE",length=5)
	private String fmofPositionCode;
	
	@Column(name="ADDRESS1",length=50)
	private String fmofAddress1;
	
	@Column(name="ADDRESS2",length=50)
	private String fmofAddress2;
	
	@Column(name="ADDRESS3",length=50)
	private String fmofAddress3;
	
	@Column(name="CITY",length=100)
	private String fmofCity;
	
	@Column(name="LOCATION",length=50)
	private String fmofLocation;
	
	@Column(name="PHONE1",length=50)
	private String fmofPhone1;
	
	@Column(name="PHONE2",length=50)
	private String fmofPhone2;
	
	@Column(name="PHONE3",length=50)
	private String fmofPhone3;
	
	@Column(name="BPKB_PRC_TIME")
	private Integer fmofBpkbPrctime;
	
	@Column(name="OFFICE_CLASSCODE",length=7)
	private String fmofOfficeClascode;
	
	@Column(name="DIFF_TIME")
	private Integer fmofDiffTime;
	
	@Column(name="VALID_PO_DAYS")
	private Integer fmofValidPoDays;
	
	@Column(name="REGION_AR_CODE",length=5)
	private String fmofRegionArCode;
	
	@Column(name="OFFICE_CATEGORY",length=3)
	private String fmofCaegory;
	
	@Column(name="PIC_FIRST_NAME",length=50)
	private String fmofPicFirstName;
	
	@Column(name="PIC_LAST_NAME",length=50)
	private String fmofPicLastName;
	
	@Column(name="PIC_ADDR1",length=50)
	private String fmofPicAddress1;
	
	@Column(name="PIC_ADDR2",length=50)
	private String fmofPicAddress2;
	
	@Column(name="PIC_ADDR3",length=50)
	private String fmofPicAddress3;	
	
	@Column(name="PIC_PHONE1",length=50)
	private String fmofPicPhone1;
	
	@Column(name="PIC_PHONE2",length=50)
	private String fmofPicPhone2;
	
	@Column(name="PIC_PHONE3",length=50)
	private String fmofPicPhone3;
	
	@Column(name="STATUS_FLAG",length=1)
	private String fmofStatusFlag;
	
	@Column(name="BRANCH_CODE",length=5)
	private String fmofBranchCode;
	
	@Column(name="PROCESS_GROUP")
	private Integer fmofProgressGrp;
	
	@Column(name="REGIONAL_ID_INSC",length=5)
	private String fmofRegionalIdInsc;
	
	@Column(name="PROFIT_DEALER_FLAT_AMT")
	private Integer fmofProfitdealerFlatAmt;
	
	@Column(name="PROFIT_DEALER_BY_GRADE", length=1)
	private String fmofProfitdealerByGrade;
	
	@Column(name="PROFIT_DEALER_PCT")
	private Integer fmofProfitPct;
	
	@Column(name="ACCS_PRICE_DEV_PCT")
	private Integer fmofAccsPriceDevPct;
	
	@Column(name="STARTED_TIMESTAMP")
	private Date fmofStartedTimestamp;
	
	@Column(name="CREATED_BY", length=15)
	private String fmofCreatedBy;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date fmofCreatedTimestamp;
	
	@Column(name="LASTUPDATE_BY", length=15)
	private String fmofLastUpdateBy;
	
	@Column(name="LASTUPDATE_TIMESTAMP")
	private Date fmofLastUpdateTimestamp;
	
	@Column(name="REGIONAL_OPR", length=5)
	private String fmofRegionalopr;
	
	@Column(name="OFFICE_MIN_DP")
	private Integer fmofMinDp;
	
	@Column(name="NIAGA_CODE_DATI_II", length=5)
	private String fmofNiagaCodeDatiII;
	
	@Column(name="KODE_PLAT", length=3)
	private String fmofKodePlat;
	
	@Column(name="GL_OFFICE", length=5)
	private String fmofGlOffice;
	
	@Column(name="NAMA_KOTA", length=100)
	private String fmofNamaKota;
	
	@Column(name="BRANCH_NAME", length=100)
	private String fmofBranchName;
	
	@Column(name="ZIP_CODE", length=5)
	private String fmofZipCode;
	
	@Column(name="FLAG_SPECIAL_OFFICE", length=1)
	private String fmofSpecialOffFlag;
	
	@Column(name="COY_ID", length=5)
	private String fmofCoyId;
	
	
	         
}
