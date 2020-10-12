package org.fourstack.adavancespring.config.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MobileInfoConfig {

	private String mobileId;
	private String mobileName;
	private String companyName;
	private String software;
	private int version;

}
