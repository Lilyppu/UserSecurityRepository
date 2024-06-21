package com.UserSecurity.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.ApplMenus;

@Repository
public interface IApplMenusRepository extends JpaRepository<ApplMenus, String> {

	Optional<ApplMenus>findByMenuId(String menuId);
}
