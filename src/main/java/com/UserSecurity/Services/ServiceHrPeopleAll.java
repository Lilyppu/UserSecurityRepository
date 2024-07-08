package com.UserSecurity.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.UserSecurity.Models.HrPeopleAll;
import com.UserSecurity.Repository.IHrPeopleAllRepository;

@Service
public class ServiceHrPeopleAll {
	@Autowired
	IHrPeopleAllRepository repoHrPeopleAllTab;
	
	public List<HrPeopleAll> getHrPeopleAllTabList() {
		return repoHrPeopleAllTab.findAll();
	} 
	
	public String saveUpdateHrPeopleAll(HrPeopleAll saveupdhrpeopleall) {
		repoHrPeopleAllTab.save(saveupdhrpeopleall);
		return "Submit Successfully";
	}
	
	public Optional<HrPeopleAll> gethpaPersonId(Integer hpaPersonId){
	    return repoHrPeopleAllTab.findByhpaPersonId(hpaPersonId);
	}
}
