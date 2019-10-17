package com.shc.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.shc.exception.CustomException;
import com.shc.mapper.ComDepartmentMapper;
import com.shc.pojo.ComDepartmentEntity;

@Service
public class ComDepartmentService {

	private Logger log = Logger.getLogger(ComDepartmentService.class);
	@Autowired
	private ComDepartmentMapper comDepartMapper;
	
	public ComDepartmentEntity getDepInfoByNo(String dep_no) {
		if(StringUtils.isEmpty(dep_no)) {
			log.error("dep_no参数异常,不可为空");
			throw new CustomException("参数为空");
		}
		
		ComDepartmentEntity com_depart = comDepartMapper.getDepByNo(dep_no);
		
		if(com_depart == null) {
			log.error("找不到dep_no="+dep_no+"的记录");
			throw new CustomException("查询记录为空");
		}
		
		return com_depart;
	}
}
