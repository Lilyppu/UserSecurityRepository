package Models;

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
@Table(name= "appl_roles")

public class ApplRoles {

	@Id
	@Column (name="ROLE_ID", nullable = false)
	private Integer aroRoleId;
	
	@Column (name="ROLE_NAME",length=100,nullable = false)
	private String aroRoleName;
	
	@Column (name="ROLE_DESCRIPTION",length=300,nullable = false)
	private String aroRoleDescription;
	
	@Column (name="ROLE_CREATED_BY",length=30,nullable = false)
	private String aroRoleCreatedBy;
	
	@Column (name="ROLE_CREATED_DATE",nullable = false)
	private Date aroRoleCreatedDate;
	
	@Column (name="ROLE_UPDATED_BY",length=30)
	private String aroRoleUpdatedBy;
		
	@Column (name="ROLE_UPDATED_DATE")
	private Date aroRoleUpdatedDate;
	
}
