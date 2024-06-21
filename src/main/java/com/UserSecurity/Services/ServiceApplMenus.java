package com.UserSecurity.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserSecurity.Models.ApplMenus;
import com.UserSecurity.Repository.IApplMenusRepository;

@Service
public class ServiceApplMenus {
	@Autowired
	IApplMenusRepository repoMenusTab;
	
	public List<ApplMenus> getApplMenusTabList() {
		return repoMenusTab.findAll();
	} 
	
	public String saveUpdateApplMenus(ApplMenus saveupdmenu) {
		repoMenusTab.save(saveupdmenu);
		return "Submit Successfully";
	}
	
	public Optional<ApplMenus> getMenuId(String menuId){
	    return repoMenusTab.findByMenuId(menuId);
	}

	public String DelApplMenusByMenuId(String menuId) {
		repoMenusTab.deleteById(menuId);
		return "Delete Successfully";
	}
	
}
