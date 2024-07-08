package com.UserSecurity.Models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApplUserRolesCompKey implements Serializable {
	
	private String aurUserId;
	private Integer aurRoleId;
	
}
