package com.UserSecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UserSecurity.Models.TestTable;

@Repository
public interface ITestTableRepository extends JpaRepository<TestTable, String> {

}