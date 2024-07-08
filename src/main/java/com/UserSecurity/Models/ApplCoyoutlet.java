package com.UserSecurity.Models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "appl_coyoutlet")
public class ApplCoyoutlet {

	@Id
	@Column(name="coyoutlet_id",length=5,nullable = false)
	private String acCoyoutletId;
	
	@Column(name="coyoutlet_name",length=100)
	private String acCoyoutletName;
	
	@Column(name="coyoutlet_street",length=200)
	private String acCoyoutletStreet;
	
	@Column(name="coyoutlet_kel",length=30)
	private String acCoyoutletKel;
	
	@Column(name="coyoutlet_kec",length=30)
	private String acCoyoutletKec;
	
	@Column(name="coyoutlet_kabkota",length=30)
	private String acCoyoutletKabkota;
	
	@Column(name="coyoutlet_kodepos",length=5)
	private String acCoyoutletKodepos;
	
	@Column(name="coyoutlet_prov",length=50)
	private String acCoyoutletProv;
	
	@Column(name="coyoutlet_created_by",length=30,nullable = false)
	private String acCoyoutletCreatedBy;
	
	@Column(name="coyoutlet_created_date",nullable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date acCoyoutletCreatedDate;
	
	@Column(name="coyoutlet_updated_by",length=30)
	private String acCoyoutletUpdatedBy;
	
	@Column(name="coyoutlet_updated_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date acCoyoutletUpdatedDate;
	
	@Column(name="coyoutlet_brhead_id",length=10)
	private String acCoyoutletBrheadId;
	
	@Column(name="coyoutlet_crhead_id",length=10)
	private String acCoyoutletCrheadId;
	
	@Column(name="coyoutlet_colhead_id",length=10)
	private String acCoyoutletColheadId;
	
	@Column(name="coyoutlet_type",length=1,nullable = false)
	private String acCoyoutletType;
	
	@Column(name="coyoutlet_area_id",length=5,nullable = false)
	private String acCoyoutletAreaId;
	
	@Column(name="coyoutlet_branch",length=5,nullable = false)
	private String acCoyoutletBranch;
	
	@Column(name="coyoutlet_status",length=1,nullable = false)
	private String acCoyoutletStatus;
	
	@Column(name="coyoutlet_bi_code",length=10)
	private String acCoyoutletBiCode;
	
	@Column(name="coyoutlet_costcenter",length=20)
	private String acCoyoutletCostcenter;
	
	@Column(name="platform",length=1)
	private String acPlatform;
}
