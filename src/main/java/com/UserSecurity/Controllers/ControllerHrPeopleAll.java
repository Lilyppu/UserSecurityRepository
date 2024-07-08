package com.UserSecurity.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UserSecurity.Models.HrPeopleAll;
import com.UserSecurity.Services.ServiceHrPeopleAll;

@RestController
public class ControllerHrPeopleAll {
	@Autowired
	ServiceHrPeopleAll servHrPeopleAll;
	
	@GetMapping("UserSecurity/hrpeopleallstablist")
	public List<HrPeopleAll> getHrPeopleAllTabList(){
		return servHrPeopleAll.getHrPeopleAllTabList();
	}
	
	@PostMapping("UserSecurity/saveupdhrpeopleall")
	public String saveUpdateHrPeopleAll(@RequestBody HrPeopleAll saveupdhrpeopleall) {
		return servHrPeopleAll.saveUpdateHrPeopleAll(saveupdhrpeopleall);
	}

	@GetMapping("/UserSecurity/gethpapersonid")
	public Optional<HrPeopleAll>gethpaPersonId(Integer hpaPersonId) {
		return servHrPeopleAll.gethpaPersonId(hpaPersonId);
	}
}
