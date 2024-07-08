package com.UserSecurity.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UserSecurity.Models.ApplUserRoles;
import com.UserSecurity.Services.ServiceApplUserRoles;

@RestController
public class ControllerApplUserRoles {

	@Autowired
	ServiceApplUserRoles servApplUserRoles;
	
	@GetMapping("/UserSecurity/findbyauruserid")
	public List<ApplUserRoles> findByAurUserId(String aurUserId){
		return servApplUserRoles.findByAurUserId(aurUserId);
	}
	
	@GetMapping("/UserSecurity/findbyauruseridandaurroleid")
	public Optional<ApplUserRoles> findByAurUserIdAndAurRoleId(String aurUserId, Integer aurRoleId) {
		return servApplUserRoles.findByAurUserIdAndAurRoleId(aurUserId, aurRoleId);
	}
	
	@PostMapping("/UserSecurity/saveupdateappluserroles")
	public String saveUpdateApplUserRoles(@RequestBody ApplUserRoles aur) {
		return servApplUserRoles.saveUpdateApplUserRoles(aur);
	}
	
	@GetMapping("/UserSecurity/getdelappluserroles")
	public String getDelApplUserRoles(String aurUserId, Integer aurRoleId) {
		servApplUserRoles.getDelApplUserRoles(aurUserId, aurRoleId);
		return "Delete Successfully";
	}
	
}
