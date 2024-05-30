package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Models.TestTable;
import Repository.ITestTableRepository;

@Service
public class ServiceTestTable {
	@Autowired
	
	ITestTableRepository RepoTestTable;
	
	public String getTestTableAll() { //List<TestTable> getTestTableAll(){
//		return RepoTestTable.findAll();
		return "abcd";
	}
}
