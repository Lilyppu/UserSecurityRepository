package com.UserSecurity.Services;

import java.util.List;

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
}
