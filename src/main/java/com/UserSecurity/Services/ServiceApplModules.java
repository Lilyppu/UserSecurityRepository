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
	IApplModulesRepository repoModulesTab;
	
	public List<ApplModules> getApplModulesTabList() {
		return repoModulesTab.findAll();
	} 
	
	public String saveUpdateApplModules(ApplModules saveupdmod) {
		repoModulesTab.save(saveupdmod);
		return "Submit Successfully";
	}
	
	public Optional<ApplModules> getModId(Integer modId){
	    return repoModulesTab.findByModId(modId);
	}

	public String DelApplModulesByModId(Integer modId) {
		repoModulesTab.deleteById(modId);
		return "Delete Successfully";
	}
}