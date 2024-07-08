package com.UserSecurity.Models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "appl_userroles")
@IdClass(ApplUserRolesCompKey.class)
public class ApplUserRoles {

	@Id
	@Column(name="user_id",length=30,nullable = false)
	private String aurUserId;
	
	@Id
	@Column(name="role_id",nullable = false)
	private Integer aurRoleId;
	
	@Column(name="created_by",length=30,nullable = false)
	private String aurCreatedBy;
	
	@Column(name="created_date",nullable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date aurCreatedDate;	
	
	@Column(name="updated_by",length=30,nullable = false)
	private String aurUpdatedBy;
	
	@Column(name="updated_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date aurUpdatedDate;
	
	@Column(name="eff_from_date",nullable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date aurEffFromDate;
	
	@Column(name="eff_to_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date aurEffToDate;
	
}
