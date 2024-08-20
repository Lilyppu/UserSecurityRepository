package com.UserSecurity.Models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApplUserMenusFavCompKey implements Serializable {
	private String aumfUserId;
	private Integer aumfModuleId;
	private String aumfMenuId;
}
