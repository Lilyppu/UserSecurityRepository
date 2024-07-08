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
@Table(name = "appl_usermenus")
@IdClass(ApplUserMenusCompKey.class)
public class ApplUserMenus {

	@Id
	@Column(name="user_id",length=30,nullable = false)
	private String aumUserId;
	
	@Id
	@Column(name="module_id",nullable = false)
	private Integer aumModuleId;
	
	@Id
	@Column(name="menu_id",length=10,nullable = false)
	private String aumMenuId;

	@Column(name="usermenu_mode_allowed",length=1,nullable = false)
	private String aumUsermenuAllowed;
	
	@Column(name="usermenu_delete_allowed",length=1,nullable = false)
	private String aumUsermenuDeleteAllowed;
	
	@Column(name="usermenu_print_allowed",length=1,nullable = false)
	private String aumUsermenuPrintAllowed;
	
	@Column(name="usermenu_created_by",length=30,nullable = false)
	private String aumUsermenuCreatedBy;
	
	@Column(name="usermenu_created_date",nullable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date aumUsermenuCreatedDate;	
	
	@Column(name="usermenu_updated_by",length=30)
	private String aumUsermenuUpdateBy;
	
	@Column(name="usermenu_updated_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date aumUsermenuUpdatedDate;
	
	@Column(name="eff_from_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date aumEffFromDate;
	
	@Column(name="eff_to_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date aumEffToDate;
	
}
