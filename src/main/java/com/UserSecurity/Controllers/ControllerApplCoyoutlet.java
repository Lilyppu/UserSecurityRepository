package com.UserSecurity.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UserSecurity.Models.ApplCoyoutlet;
import com.UserSecurity.Services.ServiceApplCoyoutlet;

@RestController
public class ControllerApplCoyoutlet {
	@Autowired
	ServiceApplCoyoutlet servApplCoyoutlet;
	
	@GetMapping("UserSecurity/applcoyoutlettablist")
	public List<ApplCoyoutlet> getApplCoyoutletTabList(){
		return servApplCoyoutlet.getApplCoyoutletTabList();
	}
	
	@PostMapping("UserSecurity/saveupdateapplcoyoutlet")
	public String saveUpdateApplCoyoutlet(@RequestBody ApplCoyoutlet saveupdapplcoyoutlet) {
		return servApplCoyoutlet.saveUpdateApplCoyoutlet(saveupdapplcoyoutlet);
	}

	@GetMapping("/UserSecurity/getaccoyoutletid")
	public Optional<ApplCoyoutlet>getacCoyoutletId(String acCoyoutletId) {
		return servApplCoyoutlet.getacCoyoutletId(acCoyoutletId);
	}
	
}
