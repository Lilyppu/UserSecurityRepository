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
@Table(name = "appl_modules")

public class ApplModules {

	@Id
	@Column (name="module_id", nullable = false)
	private Integer modId;
	
	@Column (name="module_name",length=50,nullable = false)
	private String modName;
	
	@Column (name="module_desc",length=300,nullable = false)
	private String modDesc;
	
	@Column (name="module_env_na,e",length=50)
	private String modEnvName;
	
	@Column (name="module_created_by",length=30,nullable = false)
	private String modCreatedBy;
	
	@Column (name="module_created_date",nullable = false)
	private Date modCreatedDate;
		
	@Column (name="module_update_by",length=30)
	private String modUpdatedBy;
	
	@Column (name="module_update_date")
	private Date modUpdateDate;
	
}