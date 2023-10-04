package com.project.stud.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.stud.management.entity.Address;
import com.project.stud.management.entity.Student;
import com.project.stud.management.service.AdressService;
import com.project.stud.management.service.StudentService;

@Controller
@RequestMapping("/address")
public class AddressController 
{
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private AdressService addressService;
	
	@GetMapping("/add")
	public String add(Model model, @RequestParam("id") int id)
	{
		Address address = new Address();
		model.addAttribute("address", address);
		model.addAttribute("id", id);
		return "address-form";
	}
	
	@PostMapping("/save")
	public String save(@RequestParam("id") int id, @ModelAttribute("address") Address address)
	{
		Student student = studentService.findById(id);
		address.setStudent(student);
		addressService.save(address);
		student.setAddres(address);
		studentService.save(student);
		return "redirect:/students";
	}
	
}
