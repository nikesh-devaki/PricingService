package com.ndevaki.skillovilla.CoursePricing.model.pricing.charges;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.ndevaki.skillovilla.CoursePricing.model.Course;

@Entity
@DiscriminatorValue(value="CURRENCY_CHARGES")
public class CurrencyConverstionCharges extends Charge{

	private String currency;
	private static final Map<String,Double> conversionMap=new HashMap<String,Double>();
	static {
		conversionMap.put("USD",0.013);
		conversionMap.put("GBP",0.0097);
		conversionMap.put("INR",1.0);
	}
	
	public CurrencyConverstionCharges(Course course) {
		super(course);
	}
	
	public CurrencyConverstionCharges() {
		super(null);
	}

	public CurrencyConverstionCharges(Course course, String currency) {
		super(course);
		this.currency = currency;
	}

	@Override
	public double getCharge() {
		if(conversionMap.containsKey(currency)) {
			return this.course.getBasePrice()*conversionMap.get(currency);
		}else {
			//TODO: Handle error cases.
		}
		return this.course.getBasePrice();
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
