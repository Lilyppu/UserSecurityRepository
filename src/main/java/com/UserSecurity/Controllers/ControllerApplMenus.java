package com.UserSecurity.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UserSecurity.Models.ApplMenus;
import com.UserSecurity.Services.ServiceApplMenus;

@RestController
public class ControllerApplMenus {
	@Autowired
	ServiceApplMenus servApplMenus;
	
	@GetMapping("UserSecurity/menustablist")
	public List<ApplMenus> getApplMenusTabList(){
		return servApplMenus.getApplMenusTabList();
	}
	
	@PostMapping("UserSecurity/saveupdapplmenus")
	public String saveUpdateApplMenus(@RequestBody ApplMenus saveupdmenu) {
		return servApplMenus.saveUpdateApplMenus(saveupdmenu);
	}

	@GetMapping("/UserSecurity/getmenuid")
	public Optional<ApplMenus>getMenuId(String menuId) {
		return servApplMenus.getMenuId(menuId);
	}
	
	@DeleteMapping("/UserSecurity/deletebymenuid")
	public String DelApplMenusByMenuId(String menuId) {
		return servApplMenus.DelApplMenusByMenuId(menuId);
	
	}
}
