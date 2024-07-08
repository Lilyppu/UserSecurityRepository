package com.UserSecurity.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.ApplUserMenus;
import com.UserSecurity.Models.ApplUserMenusCompKey;

import jakarta.transaction.Transactional;

@Repository
public interface IApplUserMenusRepository extends JpaRepository<ApplUserMenus,ApplUserMenusCompKey> {

	List<ApplUserMenus> findByAumUserId(String aumUserId);
	
	Optional<ApplUserMenus> findByAumUserIdAndAumModuleId(String aumUserId, Integer aumModuleId);
	
	Optional<ApplUserMenus> findByAumUserIdAndAumModuleIdAndAumMenuId(String aumUserId, Integer aumModuleId, String aumMenuId);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM appl_usermenus a WHERE a.user_id = ?1 AND a.module_id = ?2 AND a.menu_id = ?3",nativeQuery = true)
    int getDelApplUserMenus(String aumUserId, Integer aumModuleId, String aumMenuId);
	
}
