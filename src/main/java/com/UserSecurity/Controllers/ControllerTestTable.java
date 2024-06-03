package com.UserSecurity.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UserSecurity.Models.TestTable;
import com.UserSecurity.Services.ServiceTestTable;



@RestController
public class ControllerTestTable {
	@Autowired
	ServiceTestTable servTestTable;
	
	//@GetMapping("UserSecurity/testablist")
	//public String gettest() {
	//	return "abc 123";
	//}
	
	@GetMapping("UserSecurity/testablist")
	public List<TestTable> getTestTabList(){
		return servTestTable.getTesTabList();
	}

}
