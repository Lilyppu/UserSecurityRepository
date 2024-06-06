package com.UserSecurity.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UserSecurity.Models.ApplSecuritySetup;
import com.UserSecurity.Services.ServiceApplSecuritySetup;


@RestController
public class ControllerApplSecuritySetup {
	@Autowired
	ServiceApplSecuritySetup servSecuritySetup;

	@GetMapping("UserSecurity/securitysetuptablist")
	public List<ApplSecuritySetup>getSecuritySetupTabList(){
	return servSecuritySetup.getSecuritySetupTabList();
	}
	
}
