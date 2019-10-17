package com.shc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shc.pojo.ComDepartmentEntity;
import com.shc.service.ComDepartmentService;

@Controller
@RequestMapping("/comDepart")
public class ComDepartmentController {

	@Autowired
	private ComDepartmentService comDepartService;
	
	@RequestMapping("/byNo")
	@ResponseBody
	public ComDepartmentEntity getDepInfoByNo(@RequestParam String dep_no) throws Exception {
		ComDepartmentEntity comDepart = comDepartService.getDepInfoByNo(dep_no);
		return comDepart;
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public String addDepInfo() throws Exception {
		comDepartService.addDepInfo();
		return "sucess";
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String updateDepInfo() throws Exception {
		comDepartService.updateDepInfo();
		return "sucess";
	}
	
	@RequestMapping("/del")
	@ResponseBody
	public String delDepByNo(@RequestParam String dep_no) throws Exception {
		comDepartService.delDepInfo(dep_no);
		return "sucess";
	}
}
