package com.UserSecurity.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.ApplSecuritySetup;

@Repository
public interface IApplSecuritySetup extends JpaRepository<ApplSecuritySetup, String> {

}
