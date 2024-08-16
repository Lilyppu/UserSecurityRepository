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
@Table(name = "v_usermenu_userrolemenu")
public class VUserMenuUserRoleMenu {
	
	@Id
	@Column (name="menuid",length=10, nullable = false)
	private String vumurmMenuId;
	
	@Column (name="usersid",length=30)
	private String vumurmUsersId;
	
	@Column (name="modulename",length=300)
	private String vumurmModuleName;
	
	@Column (name="menuname",length=100)
	private String vumurmMenuName;
	
	@Column (name="menutype",length=1)
	private String vumurmMenuType;	
}
