package com.UserSecurity.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UserSecurity.Models.ApplUserMenusFavorit;
import com.UserSecurity.Services.ServiceApplUserMenusFavorit;


@RestController
public class ControllerApplUserMenusFavorit {
	@Autowired
	ServiceApplUserMenusFavorit servmnfav;
	
	@GetMapping("/User/execAddFavorit")
	public String execAddMenuFav(String p_userid, String p_menuid, String msg) {
		return servmnfav.execAddMenuFav(p_userid, p_menuid, msg);
	}
	
	@GetMapping("/User/getFavoritList")
	public List<ApplUserMenusFavorit> getMenuFavList(String p_userid){
		return servmnfav.getMenuFavList(p_userid);
	}

}
