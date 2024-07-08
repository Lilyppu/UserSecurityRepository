package com.UserSecurity.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserSecurity.Models.ApplUserSecuritySetup;
import com.UserSecurity.Repository.IApplUserSecuritySetupRepository;

@Service
public class ServiceApplUserSecuritySetup {
	@Autowired
	IApplUserSecuritySetupRepository repoApplUsersSecurityTab;
	
	public List<ApplUserSecuritySetup> getApplUserSecuritySetupTabList() {
		return repoApplUsersSecurityTab.findAll();
	} 
	
	public String saveUpdateApplUserSecuritySetup(ApplUserSecuritySetup saveupdapplusersecurity) {
		repoApplUsersSecurityTab.save(saveupdapplusersecurity);
		return "Submit Successfully";
	}
	
	public Optional<ApplUserSecuritySetup> getAusUserId(String ausUserId){
	    return repoApplUsersSecurityTab.findByausUserId(ausUserId);
	}

	public String DelApplUserSecuritySetupByUserId(String ausUserId) {
		repoApplUsersSecurityTab.deleteById(ausUserId);
		return "Delete Successfully";
	}
	
}
