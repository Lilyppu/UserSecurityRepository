package com.UserSecurity.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UserSecurity.Models.ApplRoles;
import com.UserSecurity.Services.ServiceApplRoles;

@RestController
public class ControllerApplRoles {
	@Autowired
	ServiceApplRoles servApplRoles;

	@GetMapping("UserSecurity/rolestablist")
	public List<ApplRoles> getApplModulesTabList(){
	return servApplRoles.getApplRolesTabList();
	}
}
