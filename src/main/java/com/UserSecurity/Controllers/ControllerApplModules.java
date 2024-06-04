package com.UserSecurity.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UserSecurity.Models.ApplModules;
import com.UserSecurity.Services.ServiceApplModules;


@RestController
public class ControllerApplModules {
	@Autowired
	ServiceApplModules servApplModules;
	
	@GetMapping("UserSecurity/modulestablist")
	public List<ApplModules> getApplModulesTabList(){
		return servApplModules.getApplModulesTabList();
	}
}
