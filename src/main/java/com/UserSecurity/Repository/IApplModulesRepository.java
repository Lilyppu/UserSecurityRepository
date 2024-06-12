package com.UserSecurity.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.ApplModules;

@Repository
public interface IApplModulesRepository extends JpaRepository<ApplModules, Integer> {

	Optional<ApplModules>findByModId(Integer modId);
	
}
