package com.ndevaki.skillovilla.CoursePricing.model.pricing.charges;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.ndevaki.skillovilla.CoursePricing.model.Course;

@Entity
@DiscriminatorValue(value="TAX_CHARGES")
public class TaxCharges extends Charge {

	String location;
	private static final Map<String,Double> taxMap=new HashMap<String,Double>();
	static {
		taxMap.put("BGL",0.18);
		taxMap.put("HYD",0.125);
		taxMap.put("TN",0.185);
	}
	
	public TaxCharges(Course course) {
		super(course);
	}
	private TaxCharges() {
		super(null);
	}

	public TaxCharges(Course course, String location) {
		super(course);
		this.location=location;
	}

	@Override
	public double getCharge() {
		return taxMap.get(location)*(this.course.getBasePrice());
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
