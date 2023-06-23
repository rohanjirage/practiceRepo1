package MiniProject.Employee_managment_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiniProject.Employee_managment_system.entity.Employee;
import MiniProject.Employee_managment_system.repository.EmpRepository;

@Service
public class EmpServices {
	
	@Autowired
	private EmpRepository empRepo;
	
	public void addEmp(Employee emp) {
		
		empRepo.save(emp);
		
	}
	
	public List<Employee> getAllEmp(){
		
		return empRepo.findAll();
	}

	public Employee getEmpById(int id) {
		Optional<Employee> emp  = empRepo.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}
		
		return null;
	}
	
	public void deleteEmp(int id) {
		
	    
		empRepo.deleteById(id);
	}
	
	public List<Employee> getEmpByName(String name) {
		List<Employee> emp  = empRepo.findByName( name);
		if(emp!=null) {
			return emp;
		}
		
		return null;
	}
}
