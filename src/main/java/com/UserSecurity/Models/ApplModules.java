package com.UserSecurity.Models;

import java.util.Date;

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
@Table(name = "APPL_MODULES")

public class ApplModules {

	@Id
	@Column (name="MODULE_ID", nullable = false)
	private Integer modId;
	
	@Column (name="MODULE_NAME",length=50)
	private String modName;
	
	@Column (name="MODULE_DESC",length=300)
	private String modDesc;
	
	@Column (name="MODULE_ENV_NAME",length=50)
	private String modEnvName;
	
	@Column (name="MODULE_CREATED_BY",length=30)
	private String modCreatedBy;
	
	@Column (name="MODULE_CREATED_DATE")
	private Date modCreatedDate;
		
	@Column (name="MODULE_UPDATE_BY",length=30)
	private String modUpdatedBy;
	
	@Column (name="MODULE_UPDATE_DATE")
	private Date modUpdateDate;
	
}