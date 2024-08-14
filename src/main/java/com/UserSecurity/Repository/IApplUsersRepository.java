package com.UserSecurity.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.ApplUsers;

@Repository
public interface IApplUsersRepository extends JpaRepository<ApplUsers, String> {
	
	
	@Procedure(procedureName = "P_CHECK_LOGIN")
	public String exeCheckLogin(String p_user, String p_pass, String msg);	
	
	Optional<ApplUsers> findByauUserId(String auUserId);
}
