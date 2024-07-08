package com.UserSecurity.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UserSecurity.Models.ApplUsers;
import com.UserSecurity.Services.ServiceApplUsers;

@RestController
public class ControllerApplUsers {

	@Autowired
	ServiceApplUsers servApplUsers;
	
	@GetMapping("UserSecurity/userstablist")
	public List<ApplUsers> getApplUsersTabList(){
		return servApplUsers.getApplUsersTabList();
	}
	
	@PostMapping("UserSecurity/saveupdapplusers")
	public String saveUpdateApplUsers(@RequestBody ApplUsers saveupduser) {
		return servApplUsers.saveUpdateApplUsers(saveupduser);
	}

	@GetMapping("/UserSecurity/getuserid")
	public Optional<ApplUsers>getAuUserId(String auUserId) {
		return servApplUsers.getAuUserId(auUserId);
	}
	
	@DeleteMapping("/UserSecurity/deletebyuserid")
	public String DelApplUsersByUserId(String auUserId) {
		return servApplUsers.DelApplUsersByUserId(auUserId);
	}
}
