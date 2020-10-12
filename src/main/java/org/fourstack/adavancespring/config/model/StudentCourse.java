package org.fourstack.adavancespring.config.model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentCourse {
	private String courseId;
	private String courseName;
	//private String courseSubjects;
	private List<String> courseSubjects;
}
