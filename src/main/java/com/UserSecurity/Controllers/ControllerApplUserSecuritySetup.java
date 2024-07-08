package com.UserSecurity.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UserSecurity.Models.ApplUserSecuritySetup;
import com.UserSecurity.Services.ServiceApplUserSecuritySetup;

@RestController
public class ControllerApplUserSecuritySetup {

	@Autowired
	ServiceApplUserSecuritySetup servApplUserSecuritySetup;
	
	@GetMapping("UserSecurity/applusersecuritysetuptablist")
	public List<ApplUserSecuritySetup> getApplUserSecuritySetupTabList(){
		return servApplUserSecuritySetup.getApplUserSecuritySetupTabList();
	}
	
	@PostMapping("UserSecurity/saveupdapplusersecuritysetup")
	public String saveUpdateApplUserSecuritySetup(@RequestBody ApplUserSecuritySetup saveupdapplusersecurity) {
		return servApplUserSecuritySetup.saveUpdateApplUserSecuritySetup(saveupdapplusersecurity);
	}

	@GetMapping("/UserSecurity/getapplusersecuritysetupbyuserid")
	public Optional<ApplUserSecuritySetup>getAusUserId(String ausUserId) {
		return servApplUserSecuritySetup.getAusUserId(ausUserId);
	}
	
	@DeleteMapping("/UserSecurity/deleteapplusersecuritysetupbyuserid")
	public String DelApplUserSecuritySetupByUserId(String ausUserId) {
		return servApplUserSecuritySetup.DelApplUserSecuritySetupByUserId(ausUserId);
	}
	
}
