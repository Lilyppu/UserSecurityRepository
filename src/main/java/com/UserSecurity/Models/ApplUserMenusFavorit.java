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
@Table(name = "appl_usermenus_favorit")
@IdClass(ApplUserMenusFavCompKey.class)
public class ApplUserMenusFavorit {

	@Id
	@Column(name="user_id",length=30,nullable = false)
	private String aumfUserId;
	
	@Id
	@Column(name="module_id",nullable = false)
	private Integer aumfModuleId;
	
	@Id
	@Column(name="menu_id",length=10,nullable = false)
	private String aumfMenuId;

	@Column(name="usermenu_mode_allowed",length=1,nullable = false)
	private String aumfUsermenuAllowed;
	
	@Column(name="usermenu_delete_allowed",length=1,nullable = false)
	private String aumfUsermenuDeleteAllowed;
	
	@Column(name="usermenu_print_allowed",length=1,nullable = false)
	private String aumfUsermenuPrintAllowed;
	
	@Column(name="usermenu_created_by",length=30,nullable = false)
	private String aumfUsermenuCreatedBy;
	
	@Column(name="usermenu_created_date",nullable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date aumfUsermenuCreatedDate;	
	
	@Column(name="usermenu_updated_by",length=30)
	private String aumfUsermenuUpdateBy;
	
	@Column(name="usermenu_updated_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date aumfUsermenuUpdatedDate;
	
	@Column(name="eff_from_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date aumfEffFromDate;
	
	@Column(name="eff_to_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date aumfEffToDate;
	
}



