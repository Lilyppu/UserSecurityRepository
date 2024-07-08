package com.UserSecurity.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.HrPeopleAll;

@Repository
public interface IHrPeopleAllRepository extends JpaRepository<HrPeopleAll,Integer> {

	Optional<HrPeopleAll>findByhpaPersonId(Integer hpaPersonId);
	
}
