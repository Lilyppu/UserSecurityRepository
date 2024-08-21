package com.UserSecurity.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.ApplUserMenusFavCompKey;
import com.UserSecurity.Models.ApplUserMenusFavorit;

import jakarta.transaction.Transactional;

@Repository
public interface IApplUserMenusFavoritRepository extends JpaRepository<ApplUserMenusFavorit,ApplUserMenusFavCompKey> {
	@Procedure(procedureName = "ADD_MENU_FAVORIT")
	public String exeAddFavorit(String p_userid, String p_menuid, String msg);
	
	@Procedure(procedureName = "DELETE_MENU_FAVORIT")
	public String exeDeleteFavorit(String p_userid, String p_menuid, String msg);
	
	public List<ApplUserMenusFavorit> findByAumfUserId (String p_userid);
}
