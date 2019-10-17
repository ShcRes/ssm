package com.shc.mapper;

import com.shc.pojo.ComDepartmentEntity;

public interface ComDepartmentMapper {

	ComDepartmentEntity getDepByNo(String dep_no);
	
	int insertOne(ComDepartmentEntity comDepart);
	
	int updateByNo(ComDepartmentEntity comDepart);
	
	int deleteByNo(String dep_no);
}
