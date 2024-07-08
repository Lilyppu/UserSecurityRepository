package com.UserSecurity.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserSecurity.Models.ApplUsers;
import com.UserSecurity.Repository.IApplUsersRepository;

@Service
public class ServiceApplUsers {
	@Autowired
	IApplUsersRepository repoUsersTab;
	
	public List<ApplUsers> getApplUsersTabList() {
		return repoUsersTab.findAll();
	} 
	
	public String saveUpdateApplUsers(ApplUsers saveupduser) {
		repoUsersTab.save(saveupduser);
		return "Submit Successfully";
	}
	
	public Optional<ApplUsers> getAuUserId(String auUserId){
	    return repoUsersTab.findByauUserId(auUserId);
	}

	public String DelApplUsersByUserId(String auUserId) {
		repoUsersTab.deleteById(auUserId);
		return "Delete Successfully";
	}
	
}
