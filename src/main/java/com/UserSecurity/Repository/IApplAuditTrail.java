package com.UserSecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.ApplAuditTrail;

@Repository
public interface IApplAuditTrail extends JpaRepository<ApplAuditTrail, String> {

}
