package com.UserSecurity.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserSecurity.Models.ApplAuditTrail;
import com.UserSecurity.Repository.IApplAuditTrail;

@Service
public class ServiceAuditTrail {
	@Autowired

	IApplAuditTrail RepoAuditTrailTab;
	
	public List<ApplAuditTrail> getApplAuditTrailTabList() {
		return RepoAuditTrailTab.findAll();
} 
}
