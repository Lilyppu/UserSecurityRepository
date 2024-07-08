package com.UserSecurity.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.ApplUserSecuritySetup;

@Repository
public interface IApplUserSecuritySetupRepository extends JpaRepository<ApplUserSecuritySetup, String> {

	Optional<ApplUserSecuritySetup> findByausUserId(String ausUserId);
}
