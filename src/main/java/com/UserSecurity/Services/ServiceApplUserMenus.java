package com.UserSecurity.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserSecurity.Models.ApplUserMenus;
import com.UserSecurity.Repository.IApplUserMenusRepository;

@Service
public class ServiceApplUserMenus {

	@Autowired
	IApplUserMenusRepository repoApplUserMenus;
	
	public List<ApplUserMenus> findByAumUserId(String aumUserId){
		return repoApplUserMenus.findByAumUserId(aumUserId);
	}
	
	public Optional<ApplUserMenus> findByAumUserIdAndAumModuleId(String aumUserId, Integer aumModuleId){
	    return repoApplUserMenus.findByAumUserIdAndAumModuleId(aumUserId, aumModuleId);
	}
	
	public Optional<ApplUserMenus> findByAumUserIdAndAumModuleIdAndAumMenuId(String aumUserId, Integer aumModuleId, String aumMenuId){
	    return repoApplUserMenus.findByAumUserIdAndAumModuleIdAndAumMenuId(aumUserId, aumModuleId, aumMenuId);
	}
	
	public String saveUpdateApplUserMenus(ApplUserMenus aum) {
		repoApplUserMenus.save(aum);
		return "Submit Successfully";
	}
	
	public String getDelApplUserMenus(String aumUserId, Integer aumModuleId, String aumMenuId) {
		repoApplUserMenus.getDelApplUserMenus(aumUserId, aumModuleId, aumMenuId);
		return "Delete Successfully";
	}
}
