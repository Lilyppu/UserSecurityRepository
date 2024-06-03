package com.UserSecurity.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TESTTABLE")
public class TestTable {
	@Id
	@Column(name="KOLOM1")
	private String kolomSatu;
	
	@Column(name="KOLOM2")
	private String kolomDua;
	
	@Column(name="KOLOM3")
	private String kolomTiga;
}
