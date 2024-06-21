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
@Table(name = "appl_audit_trail")
public class ApplAuditTrail {

	@Id
	@Column(name="user_id",length=30)
	private String audiRoleId;
	
	@Column(name="log_date")
	private Date audiRoleName;
	
	@Column(name="activity", length=30)
	private String audiRoleDescription;
	
	@Column(name="object", length=50)
	private String audiObject;	
	
	@Column(name="host",length=100)
	private String audiHost;
	
	@Column(name="ip_address", length=30)
	private String audiIpAddress;
	
	@Column(name="keterangan",length=300)
	private String audiKeterangan;
	
}
