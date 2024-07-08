package com.UserSecurity.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.ApplUserRoles;
import com.UserSecurity.Models.ApplUserRolesCompKey;

import jakarta.transaction.Transactional;

@Repository
public interface IApplUserRolesRepository extends JpaRepository<ApplUserRoles,ApplUserRolesCompKey> {

	List<ApplUserRoles> findByAurUserId(String aurUserId);
	
	Optional<ApplUserRoles> findByAurUserIdAndAurRoleId(String aurUserId, Integer aurRoleId);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM appl_userroles a WHERE a.user_id = ?1 AND a.role_id = ?2",nativeQuery = true)
    int getDelApplUserRoles(String aurUserId, Integer aurRoleId);
	
}
