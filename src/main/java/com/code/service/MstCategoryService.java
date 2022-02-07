package com.code.service;

import java.util.List;
import java.util.Optional;

import com.code.entities.MstCategory;



public interface MstCategoryService {
	
	public List<MstCategory> getmstCategoryData();
	public Optional<MstCategory> getmstCategoryDataById(long codeid);
}
