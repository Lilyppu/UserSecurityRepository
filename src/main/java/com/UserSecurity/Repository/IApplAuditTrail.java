package com.UserSecurity.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.ApplAuditTrail;
import com.UserSecurity.Models.ApplModules;

@Repository
public interface IApplAuditTrail extends JpaRepository<ApplAuditTrail, String> {

	Optional<ApplAuditTrail>findByAudiRoleId(String audiRoleId);
}
