package com.UserSecurity.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
