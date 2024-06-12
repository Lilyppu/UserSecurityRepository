package com.UserSecurity.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserSecurity.Models.TestTable;
import com.UserSecurity.Repository.ITestTableRepository;

@Service
public class ServiceTestTable {
	@Autowired
	ITestTableRepository repoTestTab;
	
	public List<TestTable> getTesTabList() {
		return repoTestTab.findAll();
	}

	public String saveUpdateTestTable(TestTable test) {
		repoTestTab.save(test);
		return "Submit Successfully";
	}
	
	public Optional<TestTable> getKolomSatu(String kolsatu){
	    return repoTestTab.findByKolomSatu(kolsatu);
	}
}
