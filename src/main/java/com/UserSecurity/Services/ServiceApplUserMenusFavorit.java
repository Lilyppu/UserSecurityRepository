package com.UserSecurity.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserSecurity.Models.ApplUserMenusFavorit;
import com.UserSecurity.Repository.IApplUserMenusFavoritRepository;



@Service
public class ServiceApplUserMenusFavorit {
	@Autowired
	IApplUserMenusFavoritRepository repomnfav;
	
	public String execAddMenuFav(String p_userid, String p_menuid, String msg) {
		return repomnfav.exeAddFavorit(p_userid, p_menuid, msg);
	}
	
	public List<ApplUserMenusFavorit> getMenuFavList(String p_userid){
		return repomnfav.findByAumfUserId(p_userid);
	}
}
