package org.fourstack.adavancespring.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "study")
@Data
public class StudySubjects {

	private List<String> subjects;
}
