package org.fourstack.adavancespring.controllers;

import java.util.Map;

import org.fourstack.adavancespring.config.AppProperties;
import org.fourstack.adavancespring.config.StudentCourseMap;
import org.fourstack.adavancespring.config.model.MobileInfoConfig;
import org.fourstack.adavancespring.config.model.StudentCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api")
public class YmlToHashMapController {

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private AppProperties appProperties;
	
	@Autowired
	private StudentCourseMap studentCourseMap;

	@GetMapping("/jsonStrToMap")
	public Map<String, MobileInfoConfig> mapYmlStringToMap() throws JsonMappingException, JsonProcessingException {

		// use TypeReference for proper type references
		TypeReference<Map<String, MobileInfoConfig>> mobileConfigTypeReference = new TypeReference<Map<String, MobileInfoConfig>>() {
		};

		Map<String, MobileInfoConfig> mobileConfigMap = objectMapper.readValue(appProperties.getMobileInfo(),
				mobileConfigTypeReference);

		return mobileConfigMap;
	}

	@GetMapping("/ymlValuesToMap")
	public Map<String, StudentCourse> mapYmlValuesToMap() {
		System.out.println("Map :"+studentCourseMap.getCourses().get("PCMB").getCourseSubjects().get(0));
		return studentCourseMap.getCourses();
	}

}
