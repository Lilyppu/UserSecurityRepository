package com.UserSecurity.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UserSecurity.Models.ApplModules;
import com.UserSecurity.Services.ServiceApplModules;


@RestController
public class ControllerApplModules {
	@Autowired
	ServiceApplModules servApplModules;
	
	@GetMapping("UserSecurity/modulestablist")
	public List<ApplModules> getApplModulesTabList(){
		return servApplModules.getApplModulesTabList();
	}
	
	@PostMapping("UserSecurity/saveupdapplmodules")
	public String saveUpdateApplModules(@RequestBody ApplModules saveupdmod) {
		return servApplModules.saveUpdateApplModules(saveupdmod);
	}

	@GetMapping("/UserSecurity/getmodid")
	public Optional<ApplModules>getModId(Integer modId) {
		return servApplModules.getModId(modId);
	}
	
	@DeleteMapping("/UserSecurity/deletebymodid")
	public String DelApplModulesByModId(Integer modId) {
		return servApplModules.DelApplModulesByModId(modId);
	
	}
}
