package com.UserSecurity.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UserSecurity.Models.VUserMenuUserRoleMenu;
import com.UserSecurity.Services.ServiceVUserMenuUserRoleMenu;



@RestController
public class ControllerVUserMenuUserRoleMenu {
	@Autowired
	ServiceVUserMenuUserRoleMenu serVumurm;
	
	@GetMapping("menu/usermenulist")
	public List<VUserMenuUserRoleMenu> getUserMenus(String puserid){
		return serVumurm.getUserMenus(puserid);
	}

}
