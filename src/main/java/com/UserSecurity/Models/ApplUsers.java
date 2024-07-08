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
@Table(name = "appl_users")
public class ApplUsers {
	
	@Id
	@Column(name="user_id",length=30,nullable = false)
	private String auUserId;
	
	@Column(name="user_name",length=100,nullable = false)
	private String auUserName;
	
	@Column(name="user_password",length=30)
	private String auUserPassword;
	
	@Column(name="user_created",nullable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date auUserCreated;	
	
	@Column(name="user_created_by",length=30,nullable = false)
	private String auUserCreatedBy;
	
	@Column(name="user_updated")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date auUserUpdated;
	
	@Column(name="user_update_by",length=30)
	private String auUserUpdateBy;
	
	@Column(name="user_person_id")
	private Integer auUserPersonId;
	
	@Column(name="user_start_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date auUserStartDate;
	
	@Column(name="user_end_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date auUserEndDate;
	
	@Column(name="user_description",length=240)
	private String auUserDescription;
	
	@Column(name="user_last_logon")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date auUserLastLogon;
	
	@Column(name="user_last_password")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date auUserLastPassword;
	
	@Column(name="user_pass_lifespan")
	private Integer auUserPassLifespan;
	
	@Column(name="user_pass_need_chg",length=1,nullable = false)
	private String auUserPassNeedChg;
	
	@Column(name="user_enable_sts",length=1,nullable = false)
	private String auUserEnableSts;
	
	@Column(name="user_coyoutlet",length=5)
	private String auUserCoyoutlet;
	
}
