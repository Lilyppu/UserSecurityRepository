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
@Table(name = "appl_mst_special_days")
public class ApplMstSpecialDays {

	@Id
	@Column(name="outlet_id",length=5,nullable = false)
	private String sdOutletId;
	
	@Column(name="assign_date",nullable = false)
	private Date sdAssignDate;
	
	@Column(name="description",length=100)
	private String sdDescription;
	
	@Column(name="is_holiday",length=2)
	private String sdIsHoliday;	
	
	@Column(name="book_date")
	private Date sdBookDate;
	
	@Column(name="created_by",length=30)
	private String sdCreatedBy;
	
	@Column(name="created_timestamp")
	private Date sdCreatedTiimestamp;
	
	@Column(name="lastupdate_by",length=30)
	private String sdLastUpdateBy;
	
	@Column(name="lastupdate_timestamp")
	private Date sdLastUpdateTimestamp;
}
