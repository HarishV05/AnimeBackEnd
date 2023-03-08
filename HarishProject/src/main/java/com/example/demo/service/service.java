package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.model;
import com.example.demo.repository.repository;



@Service
public class service {
		@Autowired
		repository r;
	
		public String add(model m) {
			r.save(m);
			return "Added";
		}
		
		public List<model> getDetails() {
			return r.findAll();
		}
		
		public model updateDetails(model e1) {
			return r.saveAndFlush(e1);
		}
		public void deleteDetails(model e2) {
			r.delete(e2);
		}
		
		public List<model> getSorted(String field) {
			return r.findAll(Sort.by(Sort.Direction.ASC,field));
		}
		
		public List<model> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
			Page<model> page =r.findAll(PageRequest.of(offset, pageSize));
			return page.getContent();
		}

}