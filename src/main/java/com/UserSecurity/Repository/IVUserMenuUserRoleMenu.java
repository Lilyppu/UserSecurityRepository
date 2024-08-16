package com.UserSecurity.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.ApplCoyoutlet;
import com.UserSecurity.Models.VUserMenuUserRoleMenu;
@Repository
public interface IVUserMenuUserRoleMenu extends JpaRepository<VUserMenuUserRoleMenu, String> {
		
	public List<VUserMenuUserRoleMenu> findByVumurmUsersIdOrderByVumurmMenuId(String puserid);
	
}
