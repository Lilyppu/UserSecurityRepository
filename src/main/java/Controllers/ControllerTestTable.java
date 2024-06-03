package Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Models.TestTable;
import Services.ServiceTestTable;


@RestController
public class ControllerTestTable {
	@Autowired
	ServiceTestTable ServTestTable;

	@GetMapping("/getesttableall")
	public String gettesttableall(){ //List<TestTable> gettesttableall(){
		return ServTestTable.getTestTableAll();
	}
}
