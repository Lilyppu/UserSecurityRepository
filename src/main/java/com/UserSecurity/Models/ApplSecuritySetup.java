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
		private String auditPwdMinLengthFlag;
		
		@Column(name="pwd_min_length",length=100)
		private Integer auditPwdMinLength;
		
		@Column(name="pwd_letter_flag",length=1,nullable = false)
		private String auditPwdLetterFlag;
		
		@Column(name="pwd_number_flag",length=1,nullable = false)
		private String auditNumberFlag;	
		
		@Column(name="pwd_spechar_flag",length=1,nullable = false)
		private String auditPwdSpecharFlag;
		
		@Column(name="pwd_expiry_flag",length=1,nullable = false)
		private String auditExpiryFlag;
		
		@Column(name="pwd_expiry_length")
		private Integer auditPwdExpiryLength;
		
		@Column(name="pwd_history_flag",length=1,nullable = false)
		private String auditPwdHistoryFlag;	
		
		@Column(name="max_login_attempts")
		private Integer auditMaxLoginAttempts;
		
		@Column(name="multiple_login_flag",length=1,nullable = false)
		private String auditMultipleLoginFlag;
		
		@Column(name="max_sessions")
		private Integer auditMaxSessions;
		
		@Column(name="created_by", length=30)
		private String auditCreatedBy;	
		
		@Column(name="created_date")
		private Date auditCreatedDate;
		
		@Column(name="last_updated_by", length=30)
		private String auditUpdatedBy;
		
		@Column(name="last_updated_date")
		private Date auditUpdatedDate;
}
