package com.ndevaki.skillovilla.CoursePricing.model.pricing.scheme;

import java.util.ArrayList;

public class SubscriptionPricingScheme implements PricingStrategy {

	String SubscriptionPricingScheme="One Time Payment";
	
	public SubscriptionPricingScheme() {
		this.properties.put("months",6);
		
		
	}

}
