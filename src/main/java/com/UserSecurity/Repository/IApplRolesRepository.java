package com.UserSecurity.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.ApplRoles;

@Repository
public interface IApplRolesRepository extends JpaRepository<ApplRoles, Integer> {

	Optional<ApplRoles> findByRoleId(Integer roleId);
	}
