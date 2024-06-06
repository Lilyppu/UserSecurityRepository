package com.UserSecurity.Models;

import java.math.BigDecimal;
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
@Table(name = "appl_roles")

public class ApplRoles {

	@Id
	@Column(name="role_id", nullable = false)
	private Integer roleId;
	
	@Column(name="role_name",length=100, nullable = false)
	private String roleName;
	
	@Column(name="role_description", length=300, nullable = false)
	private String roleDescription;
	
	@Column(name="role_created_by", length=30, nullable = false)
	private String roleCreatedBy;	
	
	@Column(name="role_created_date",nullable = false)
	private Date roleCreatedDate;
	
	@Column(name="role_updated_by", length=30)
	private String roleUpdatedBy;
	
	@Column(name="role_updated_date")
	private Date roleUpdatedDate;
	
}
