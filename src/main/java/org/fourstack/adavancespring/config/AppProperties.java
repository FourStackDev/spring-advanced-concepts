package org.fourstack.adavancespring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class AppProperties {

	@Value("${MOBILE_INFO}")
	private String mobileInfo;
	
	@Value("${STUDENT_NAMES}")
	private String[] studentNames;

}
