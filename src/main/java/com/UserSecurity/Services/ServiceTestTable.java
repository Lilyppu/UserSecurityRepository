package com.UserSecurity.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserSecurity.Models.TestTable;
import com.UserSecurity.Repository.ITestTableRepository;

@Service
public class ServiceTestTable {
	@Autowired
	ITestTableRepository RepoTestTab;
	
	public List<TestTable> getTesTabList() {
		return RepoTestTab.findAll();
	}

}
