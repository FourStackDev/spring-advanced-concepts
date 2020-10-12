package org.fourstack.adavancespring.config;

import java.util.Map;

import org.fourstack.adavancespring.config.model.StudentCourse;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "student")
@Data
public class StudentCourseMap {
	
	
	private Map<String, StudentCourse> courses;

}
