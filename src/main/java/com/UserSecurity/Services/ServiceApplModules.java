package com.UserSecurity.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserSecurity.Models.ApplModules;
import com.UserSecurity.Repository.IApplModulesRepository;

@Service
public class ServiceApplModules {
	@Autowired
	IApplModulesRepository RepoModulesTab;
	
	public List<ApplModules> getApplModulesTabList() {
		return RepoModulesTab.findAll();
	} 
	
	public String saveUpdateApplModules(ApplModules saveupdmod) {
		RepoModulesTab.save(saveupdmod);
		return "Submit Successfully";
	}
	
	public Optional<ApplModules> getModId(Integer modId){
	    return RepoModulesTab.findByModId(modId);
	}

}