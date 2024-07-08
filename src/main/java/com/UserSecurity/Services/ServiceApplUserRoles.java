package com.UserSecurity.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserSecurity.Models.ApplUserRoles;
import com.UserSecurity.Repository.IApplUserRolesRepository;

@Service
public class ServiceApplUserRoles {
	
	@Autowired
	IApplUserRolesRepository repoApplUserRoles;
	
	public List<ApplUserRoles> findByAurUserId(String aurUserId){
		return repoApplUserRoles.findByAurUserId(aurUserId);
	}
	
	public Optional<ApplUserRoles> findByAurUserIdAndAurRoleId(String aurUserId, Integer aurRoleId){
	    return repoApplUserRoles.findByAurUserIdAndAurRoleId(aurUserId, aurRoleId);
	}
	
	public String saveUpdateApplUserRoles(ApplUserRoles aur) {
		repoApplUserRoles.save(aur);
		return "Submit Successfully";
	}
	
	public String getDelApplUserRoles(String aurUserId, Integer aurRoleId) {
		repoApplUserRoles.getDelApplUserRoles(aurUserId, aurRoleId);
		return "Delete Successfully";
	}
}
