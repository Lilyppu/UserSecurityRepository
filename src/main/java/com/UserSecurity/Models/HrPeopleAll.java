package com.UserSecurity.Models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hr_people_all")
public class HrPeopleAll {

	@Id
	@Column(name="person_id",nullable = false)
	private Integer hpaPersonId;
	
	@Column(name="person_full_name",length=60)
	private String hpaPersonFullName;
	
	@Column(name="person_status",length=2,nullable = false)
	private String hpaPersonStatus;

	@Column(name="person_eff_startdate")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date hpaPersonEffStartdate;
	
	@Column(name="person_main_job",length=3)
	private String hpaPersonMainJob;
	
	@Column(name="person_outlet_id",length=5,nullable = false)
	private String hpaPersonOutletId;
	
	@Column(name="created_by",length=30,nullable = false)
	private String hpaCreatedBy;
	
	@Column(name="created_date",nullable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date hpaCreatedDate;	
	
	@Column(name="updated_by",length=30)
	private String hpaUpdatedBy;
	
	@Column(name="updated_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date hpaUpdatedDate;
	
	@Column(name="person_empl_id",length=15)
	private String hpaPersonEmplId;
	
	@Column(name="person_empl_sts",length=2)
	private String hpaPersonEmplSts;
	
	@Column(name="person_ext_job1",length=3)
	private String hpaPersonExtJob1;
	
	@Column(name="person_ext_job2",length=3)
	private String hpaPersonExtJob2;
	
	@Column(name="person_dept_id",length=15)
	private String hpaPersonDeptId;
	
}
