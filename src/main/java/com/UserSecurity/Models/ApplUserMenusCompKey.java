package com.UserSecurity.Models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApplUserMenusCompKey implements Serializable {

	private String aumUserId;
	private Integer aumModuleId;
	private String aumMenuId;
	
}
