package com.code.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.entities.MstCategory;
import com.code.service.MstCategoryService;


@RestController
@RequestMapping(value="/course")
public class MstCategoryController {
	
	@Autowired
	private MstCategoryService mstCategoryService;
	
	@GetMapping("/category")
    public List<MstCategory> getStateData(){
	return this.mstCategoryService.getmstCategoryData();
}
	
	@GetMapping("/category/{codeid}")
	public Optional<MstCategory> getmstCategoryData(@PathVariable String codeid) {
		return this.mstCategoryService.getmstCategoryDataById(Long.parseLong(codeid));
	}
	

}
