package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.model;
import com.example.demo.service.service;

@RestController
@CrossOrigin
public class controller {
	

		@Autowired
		service s;

		@GetMapping("/g")
		public List<model> showDetails() {
			return s.getDetails();

		}

		@PostMapping("/p")
		public String addDetails(@RequestBody model m) {
			s.add(m);
			return "Added product " + m.getSerialno();
		}
		
		@PutMapping("/u")
		public model updateInfo(@RequestBody model st) {
			return s.updateDetails(st);
		}
		@DeleteMapping("/d")
		public void deleteInfo(@RequestBody model st2) {
			s.deleteDetails(st2);
		}

		@GetMapping("/sor/{field}")
		public List<model> getWithSort(@PathVariable String field) {
			return s.getSorted(field);
		}

		@GetMapping("/pag/{offset}/{pageSize}")
		public List<model> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
			return s.getWithPagination(offset, pageSize);
		}
}