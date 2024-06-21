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
@Table(name = "appl_menus")

public class ApplMenus {

	@Id
	@Column(name="menu_id",length=10,nullable = false)
	private String menuId;
	
	@Column(name="menu_name",length=100)
	private String menuName;
	
	@Column(name="menu_type",length=1)
	private String menuType;
	
	@Column(name="menu_module_id",nullable = false)
	private Integer menuModuleId;	
	
	@Column(name="menu_file_name",length=240)
	private String menuFileName;
	
	@Column(name="menu_web_flag",length=1)
	private String menuWebFlag;
	
	@Column(name="menu_destype",length=50)
	private String menuDesType;
	
	@Column(name="menu_desformat",length=240)
	private String menuDesFormat;
	
	@Column(name="menu_is_param",length=1)
	private String menuIsParam;
	
	@Column(name="menu_add_param",length=50)
	private String menuAddParam;
	
	@Column(name="menu_web_proc",length=240)
	private String menuWebProc;
	
	@Column(name="menu_menu_id_parent",length=10)
	private String menuMenuIdParent;
	
	@Column(name="menu_created_by",length=30)
	private String menuCreatedBy;
	
	@Column(name="menu_created_date")
	private Date menuCreatedDate;
	
	@Column(name="menu_update_by",length=30)
	private String menuUpdateBy;
	
	@Column(name="menu_update_date")
	private Date menuUpdateDate;
	
	@Column(name="menu_add_param_value",length=100)
	private String menuAddParamValue;
	
	@Column(name="menu_seqn")
	private Integer menuSeqn;
	
	@Column(name="menu_enable_sts",length=1)
	private String menuEnableSts;
	
}
