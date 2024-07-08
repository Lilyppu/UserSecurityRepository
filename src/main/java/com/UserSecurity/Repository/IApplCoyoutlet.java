package com.UserSecurity.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UserSecurity.Models.ApplCoyoutlet;

public interface IApplCoyoutlet extends JpaRepository<ApplCoyoutlet,String> {

	Optional<ApplCoyoutlet>findByacCoyoutletId(String acCoyoutletId);
}
