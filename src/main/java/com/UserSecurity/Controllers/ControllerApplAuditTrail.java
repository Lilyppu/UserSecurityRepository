package com.UserSecurity.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("UserSecurity/saveupdapplaudittrail")
	public String saveUpdateApplModules(@RequestBody ApplAuditTrail saveupdaudiroleid) {
		return servAuditTrail.saveUpdateAuditTrail(saveupdaudiroleid);
	}

	@GetMapping("/UserSecurity/getaudiroleid")
	public Optional<ApplAuditTrail>getAudiRoleId(String audiRoleId) {
		return servAuditTrail.getAudiRoleId(audiRoleId);
	}
}
