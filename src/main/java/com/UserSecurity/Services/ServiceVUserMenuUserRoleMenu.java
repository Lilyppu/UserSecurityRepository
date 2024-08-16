package com.UserSecurity.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserSecurity.Models.VUserMenuUserRoleMenu;
import com.UserSecurity.Repository.IVUserMenuUserRoleMenu;

@Service
public class ServiceVUserMenuUserRoleMenu {
	@Autowired
	IVUserMenuUserRoleMenu repoVumurm;
	
	public List<VUserMenuUserRoleMenu> getUserMenus(String puserid){
		return repoVumurm.findByVumurmUsersIdOrderByVumurmMenuId(puserid);
	}
	
}
