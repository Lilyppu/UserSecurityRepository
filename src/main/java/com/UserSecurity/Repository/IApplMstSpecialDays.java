package com.UserSecurity.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.ApplAuditTrail;
import com.UserSecurity.Models.ApplMstSpecialDays;

@Repository
public interface IApplMstSpecialDays extends JpaRepository<ApplMstSpecialDays, String> {

	Optional<ApplMstSpecialDays>findBySdOutletId(String sdOutletId);
	
}
