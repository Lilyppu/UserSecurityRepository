package com.UserSecurity.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UserSecurity.Models.ApplAuditTrail;
import com.UserSecurity.Services.ServiceAuditTrail;

@RestController
public class ControllerApplAuditTrail {
	@Autowired
	ServiceAuditTrail servAuditTrail;

	@GetMapping("UserSecurity/audittrailtablist")
	public List<ApplAuditTrail> getApplAuditTrailTabList(){
	return servAuditTrail.getApplAuditTrailTabList();
	}
}
