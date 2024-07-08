package com.UserSecurity.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UserSecurity.Models.ApplUserMenus;
import com.UserSecurity.Services.ServiceApplUserMenus;

@RestController
public class ControllerApplUserMenus {

	@Autowired
	ServiceApplUserMenus servApplUserMenus;
	
	@GetMapping("/UserSecurity/findbyaumuserid")
	public List<ApplUserMenus> findByAumUserId(String aumUserId){
		return servApplUserMenus.findByAumUserId(aumUserId);
	}
	
	@GetMapping("/UserSecurity/findbyaumuseridandaummoduleid")
	public Optional<ApplUserMenus> findByAumUserIdAndAumModuleId(String aumUserId, Integer aumModuleId) {
		return servApplUserMenus.findByAumUserIdAndAumModuleId(aumUserId, aumModuleId);
	}
	
	@GetMapping("/UserSecurity/findbyaumuseridandaummoduleidandaummenuid")
	public Optional<ApplUserMenus> findByAumUserIdAndAumModuleIdAndAumMenuId(String aumUserId, Integer aumModuleId, String aumMenuId) {
		return servApplUserMenus.findByAumUserIdAndAumModuleIdAndAumMenuId(aumUserId, aumModuleId, aumMenuId);
	}
	
	@PostMapping("/UserSecurity/saveupdateapplusermenus")
	public String saveUpdateApplUserMenus(@RequestBody ApplUserMenus aum) {
		return servApplUserMenus.saveUpdateApplUserMenus(aum);
	}
	
	@GetMapping("/UserSecurity/getdelapplusermenus")
	public String getDelApplUserMenus(String aumUserId, Integer aumModuleId, String aumMenuId) {
		servApplUserMenus.getDelApplUserMenus(aumUserId, aumModuleId, aumMenuId);
		return "Delete Successfully";
	}
}
