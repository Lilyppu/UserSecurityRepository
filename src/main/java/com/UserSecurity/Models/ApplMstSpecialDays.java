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
@Table(name= "appl_mst_special_days")

public class ApplMstSpecialDays {

	@Id
	@Column (name="OUTLET_ID", nullable = false)
	private Integer amsdOutletId;
	
	@Column (name="ASSIGN_DATE", nullable = false)
	private Date amsdAssignDate;
	
	@Column (name="DESCRIPTION",length=100)
	private String amsdDescription;
	
	@Column (name="IS_HOLIDAY",length=2)
	private String amsdIsHoliday;
	
	@Column (name="BOOK_DATE")
	private Date amsdBookDate;
	
	@Column (name="CREATED_BY",length=30)
	private String amsdCreatedBy;
		
	@Column (name="CREATED_TIMESTAMP")
	private Date amsdCreatedTimestamp;
	
	@Column (name="LASTUPDATE_BY")
	private String amsdLastupdateBy;
	
	@Column (name="LASTUPDATE_TIMESTAMP")
	private Date amsdLastupdateTimestamp;
	
}
