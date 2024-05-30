package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Models.TestTable;

@Repository

public interface ITestTableRepository extends JpaRepository<TestTable, Integer> {

}
