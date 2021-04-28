package com.ndevaki.skillovilla.CoursePricing.model.pricing.charges;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.ndevaki.skillovilla.CoursePricing.model.Course;

@Entity
@DiscriminatorValue(value="TAX_CHARGES")
public class TaxCharges extends Charge {

	String location;
	
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
		return 12*(this.course.getBasePrice());
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
