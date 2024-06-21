package com.UserSecurity.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserSecurity.Models.ApplMstSpecialDays;
import com.UserSecurity.Models.ApplSecuritySetup;
import com.UserSecurity.Repository.IApplSecuritySetup;

@Service
public class ServiceApplSecuritySetup {
	@Autowired
	IApplSecuritySetup RepoSecuritySetupTab;
	
	public List<ApplSecuritySetup> getSecuritySetupTabList() {
		return RepoSecuritySetupTab.findAll();
	} 
	
	public String saveUpdateSecuritySetup(ApplSecuritySetup saveupdsecuritysetup) {
		RepoSecuritySetupTab.save(saveupdsecuritysetup);
		return "Submit Successfully";
	}
}