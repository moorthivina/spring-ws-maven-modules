package com.sample.ws.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sample.ws.dto.Employee;

@Controller
public class EmployeeController {
	
	@RequestMapping(value="employee")
	public List<Employee> list(@RequestParam("id") int id) {
		System.out.println(id);
		return getEmployee();
	}

	private List<Employee> getEmployee() {
		List<Employee> emp = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setAge(20);
		e1.setName("Moorthi");
		emp.add(e1);
		Employee e2 = new Employee();
		e2.setAge(21);
		e2.setName("Moorthi2");
		emp.add(e2);
		return emp;
	}
}
