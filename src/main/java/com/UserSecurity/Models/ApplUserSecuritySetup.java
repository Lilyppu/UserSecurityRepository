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
@Table(name = "appl_user_security_setup")
public class ApplUserSecuritySetup {

	@Id
	@Column(name="user_id",length=30,nullable = false)
	private String ausUserId;
	
	@Column(name="pwd_spechar_flag",length=1,nullable = false)
	private String ausPwdSpecharFlag;
	
	@Column(name="pwd_number_flag",length=1,nullable = false)
	private String ausPwdNumberFlag;
	
	@Column(name="pwd_min_length_flag",length=1,nullable = false)
	private String ausPwdMinLengthFlag;	
	
	@Column(name="pwd_min_length",nullable = false)
	private Integer ausPwdMinLength;
	
	@Column(name="pwd_letter_flag",length=1,nullable = false)
	private String ausPwdLetterFlag;
	
	@Column(name="pwd_history_flag",length=1,nullable = false)
	private String ausPwdHistoryFlag;
	
	@Column(name="pwd_expiry_length")
	private Integer ausPwdExpiryLength;
	
	@Column(name="pwd_expiry_flag",length=1,nullable = false)
	private String ausPwdExpiryFlag;
	
	@Column(name="multiple_login_flag",length=1,nullable = false)
	private String ausMultipleLoginFlag;
	
	@Column(name="max_sessions")
	private Integer ausMaxSessions;
	
	@Column(name="max_login_attempts")
	private Integer ausMaxLoginAttempts;
	
	@Column(name="last_updated_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date ausLastUpdatedDate;
	
	@Column(name="last_updated_by",length=30,nullable = false)
	private String ausLastUpdatedBy;
	
	@Column(name="created_date")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date ausCreatedDate;
	
	@Column(name="created_by",length=30,nullable = false)
	private String ausCreatedBy;
}
