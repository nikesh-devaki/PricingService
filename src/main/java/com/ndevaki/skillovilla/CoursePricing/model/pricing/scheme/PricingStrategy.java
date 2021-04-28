package com.ndevaki.skillovilla.CoursePricing.model.pricing.scheme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PricingStrategy {

	public String schemeName="Empty";
	public Map<String,Object> properties=new HashMap<String,Object>();
	
	public default String getName() {
		return this.schemeName;
	}
}
