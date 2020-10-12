package org.fourstack.adavancespring.controllers;

import java.util.List;

import org.fourstack.adavancespring.config.AppProperties;
import org.fourstack.adavancespring.config.StudySubjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class YmlToArrayOrListController {
	
	@Autowired
	private AppProperties appProperties;
	
	@Autowired
	private StudySubjects studySubjects;
	
	@GetMapping("/ymlToStrArray")
	public String[] getYmlToStringArray() {
		return appProperties.getStudentNames();
	}
	
	@GetMapping("/ymlValuesToList")
	public List<String> getYmlValuesToList() {
		return studySubjects.getSubjects();
	}

}
