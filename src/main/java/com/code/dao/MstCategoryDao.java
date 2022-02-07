package com.code.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.code.entities.MstCategory;


@Repository
public interface MstCategoryDao extends CrudRepository<MstCategory, Long> {

}
