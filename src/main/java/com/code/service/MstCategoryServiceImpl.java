package com.code.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dao.MstCategoryDao;
import com.code.entities.MstCategory;


@Service
public class MstCategoryServiceImpl implements MstCategoryService{
@Autowired
private MstCategoryDao mstCategoryDao;
	
	
	@Override
	public List<MstCategory> getmstCategoryData() {
		// TODO Auto-generated method stub
		
		List<MstCategory> list= (List<MstCategory>) mstCategoryDao.findAll();
		return list;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Optional<MstCategory> getmstCategoryDataById(long codeid) {
		// TODO Auto-generated method stub
		return mstCategoryDao.findById(codeid);
	}

}
