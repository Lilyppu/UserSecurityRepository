package com.UserSecurity.Services;

import java.util.List;

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
}
