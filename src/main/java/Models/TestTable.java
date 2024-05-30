package Models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "testtable")

public class TestTable {

	@Column(name="kolom1",length=2,  nullable = true)
	private String ttk1;
	
	@Column(name="kolom2",length=2,  nullable = true)
	private String ttk2;
	
	@Column(name="kolom3",length=2,  nullable = true)
	private String ttk3;
	
}
