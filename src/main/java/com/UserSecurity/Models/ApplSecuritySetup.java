package com.UserSecurity.Models;

import java.util.Date;

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
@Table(name = "appl_security_setup")
public class ApplSecuritySetup {

		@Id
		@Column(name="pwd_min_length_flag",length=1,nullable = false)
		private String secPwdMinLengthFlag;
		
		@Column(name="pwd_min_length",length=100)
		private Integer secPwdMinLength;
		
		@Column(name="pwd_letter_flag",length=1,nullable = false)
		private String secPwdLetterFlag;
		
		@Column(name="pwd_number_flag",length=1,nullable = false)
		private String secNumberFlag;	
		
		@Column(name="pwd_spechar_flag",length=1,nullable = false)
		private String secPwdSpecharFlag;
		
		@Column(name="pwd_expiry_flag",length=1,nullable = false)
		private String secExpiryFlag;
		
		@Column(name="pwd_expiry_length")
		private Integer secPwdExpiryLength;
		
		@Column(name="pwd_history_flag",length=1,nullable = false)
		private String secPwdHistoryFlag;	
		
		@Column(name="max_login_attempts")
		private Integer secMaxLoginAttempts;
		
		@Column(name="multiple_login_flag",length=1,nullable = false)
		private String secMultipleLoginFlag;
		
		@Column(name="max_sessions")
		private Integer secMaxSessions;
		
		@Column(name="created_by", length=30)
		private String secCreatedBy;	
		
		@Column(name="created_date")
		private Date secCreatedDate;
		
		@Column(name="last_updated_by", length=30)
		private String secUpdatedBy;
		
		@Column(name="last_updated_date")
		private Date secUpdatedDate;
}
