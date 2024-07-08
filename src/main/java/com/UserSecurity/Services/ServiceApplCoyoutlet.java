package com.UserSecurity.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserSecurity.Models.ApplCoyoutlet;
import com.UserSecurity.Repository.IApplCoyoutlet;

@Service
public class ServiceApplCoyoutlet {
	@Autowired
	IApplCoyoutlet repoApplCoyoutletTab;
	
	public List<ApplCoyoutlet> getApplCoyoutletTabList() {
		return repoApplCoyoutletTab.findAll();
	} 
	
	public String saveUpdateApplCoyoutlet(ApplCoyoutlet saveupdapplcoyoutlet) {
		repoApplCoyoutletTab.save(saveupdapplcoyoutlet);
		return "Submit Successfully";
	}
	
	public Optional<ApplCoyoutlet> getacCoyoutletId(String acCoyoutletId){
	    return repoApplCoyoutletTab.findByacCoyoutletId(acCoyoutletId);
	}
}
