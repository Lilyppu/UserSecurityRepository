package com.UserSecurity.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserSecurity.Models.ApplRoles;
import com.UserSecurity.Repository.IApplRolesRepository;

@Service
public class ServiceApplRoles {
	@Autowired

	IApplRolesRepository RepoRolesTab;
	
	public List<ApplRoles> getApplRolesTabList() {
		return RepoRolesTab.findAll();
	} 
	
	public String saveUpdateApplRoles(ApplRoles saveupdrol) {
		RepoRolesTab.save(saveupdrol);
		return "Submit Successfully";
	}
	
	public Optional<ApplRoles> getRolId(Integer roleId){
	    return RepoRolesTab.findByRoleId(roleId);
	}
}
