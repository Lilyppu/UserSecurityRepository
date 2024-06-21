package com.UserSecurity.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserSecurity.Models.ApplMstSpecialDays;
import com.UserSecurity.Repository.IApplMstSpecialDays;

@Service
public class ServiceApplMstSpecialDays {
	
	@Autowired

	IApplMstSpecialDays RepoSpecialDaysTab;
	
	public List<ApplMstSpecialDays> getSpecialDaysTabList() {
		return RepoSpecialDaysTab.findAll();
	}
	
	public String saveUpdateSpecialDays(ApplMstSpecialDays saveupdspecialdays) {
		RepoSpecialDaysTab.save(saveupdspecialdays);
		return "Submit Successfully";
	}
	
	public Optional<ApplMstSpecialDays> getSdOutletId(String sdOutletId){
	    return RepoSpecialDaysTab.findBySdOutletId(sdOutletId);
	}
}
