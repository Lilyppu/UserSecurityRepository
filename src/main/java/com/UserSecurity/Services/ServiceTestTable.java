package com.UserSecurity.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

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
