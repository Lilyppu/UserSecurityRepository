package com.UserSecurity.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UserSecurity.Models.ApplMstSpecialDays;
import com.UserSecurity.Services.ServiceApplMstSpecialDays;

@RestController
public class ControllerApplMstSpecialDays {
	@Autowired
	ServiceApplMstSpecialDays servSpecialDays;

	@GetMapping("UserSecurity/specialdaystablist")
	public List<ApplMstSpecialDays> getSpecialDaysTabList(){
	return servSpecialDays.getSpecialDaysTabList();
	}
	
	@PostMapping("UserSecurity/saveupdspecialdays")
	public String saveUpdateSpecialDays(@RequestBody ApplMstSpecialDays saveupdspecialdays) {
		return servSpecialDays.saveUpdateSpecialDays(saveupdspecialdays);
	}

	@GetMapping("/UserSecurity/getsdoutletid")
	public Optional<ApplMstSpecialDays>getSdOutletId(String sdOutletId) {
		return servSpecialDays.getSdOutletId(sdOutletId);
	}
}
