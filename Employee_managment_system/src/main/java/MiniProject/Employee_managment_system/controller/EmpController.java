package MiniProject.Employee_managment_system.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import MiniProject.Employee_managment_system.entity.Employee;
import MiniProject.Employee_managment_system.service.EmpServices;

@Controller
public class EmpController {
	
	@Autowired
	private EmpServices empServices;
	
	@GetMapping("/")
	public String home(Model m) {
		List<Employee> emp = empServices.getAllEmp();
		m.addAttribute("emp",emp);
		
		return "index";
	}
	
	@GetMapping("/addemp")
	public String addEmpform() {
		return "add_emp";
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee emp, HttpSession session ) {
		
		
		System.out.println(emp);
		
		empServices.addEmp(emp);
		session.setAttribute("msg","Employee Added Successfully...");
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		
		Employee emp = empServices.getEmpById(id);
		m.addAttribute("emp", emp);
		
		return "edit" ;
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Employee emp , HttpSession session){
		
		empServices.addEmp(emp);
		session.setAttribute("msg","Employee Data Update Successfully.");
		
		return "redirect:/";
		
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmp(@PathVariable int id,HttpSession session) {
		
		
		empServices.deleteEmp(id);
		session.setAttribute("msg","Employee Deleted Successfully.");
		return "redirect:/";
		
	}
	
	@GetMapping("/search/{name}")
	public String search(@RequestParam("name") String name ,Model m) {
		System.out.println("in controller");
		List<Employee> emp = empServices.getEmpByName(name);
		m.addAttribute("emp",emp);
		System.out.println(emp.toString());
		return "redirect:/search";
		
	}
	

}
