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
	
	public void addDepInfo() {
		ComDepartmentEntity com_depart = new ComDepartmentEntity();
		com_depart.setDep_no("1001");
		com_depart.setCur_dep_no("160100");
		com_depart.setDep_name("xx部门");
		com_depart.setDep_type("2");
		com_depart.setUp_dep_no("1000");
		com_depart.setUse_yn("N");
		
		comDepartMapper.insertOne(com_depart);
	}
	
	public void updateDepInfo() {
		String dep_no ="1001";
		ComDepartmentEntity com_depart = comDepartMapper.getDepByNo(dep_no);
		
		if(com_depart == null) {
			log.error("找不到dep_no="+dep_no+"的记录");
			throw new CustomException("查询记录为空");
		}
		
		com_depart.setDep_name("xxx部门");
		com_depart.setUse_yn("Y");
		
		comDepartMapper.updateByNo(com_depart);
		
	}
	public void delDepInfo(String dep_no) {
		if(StringUtils.isEmpty(dep_no)) {
			log.error("dep_no参数异常,不可为空");
			throw new CustomException("参数为空");
		}
		comDepartMapper.deleteByNo(dep_no);
	}
}
