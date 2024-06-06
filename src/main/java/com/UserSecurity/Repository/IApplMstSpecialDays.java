package com.UserSecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.ApplMstSpecialDays;

@Repository
public interface IApplMstSpecialDays extends JpaRepository<ApplMstSpecialDays, String> {

}
