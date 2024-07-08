package com.UserSecurity.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.ApplUsers;

@Repository
public interface IApplUsersRepository extends JpaRepository<ApplUsers, String> {

	Optional<ApplUsers> findByauUserId(String auUserId);
}
