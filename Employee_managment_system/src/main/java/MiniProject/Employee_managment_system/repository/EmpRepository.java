package MiniProject.Employee_managment_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MiniProject.Employee_managment_system.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer > {
	
//	List<Employee> findByName(String name);

	List<Employee> findByName(String name);

}
