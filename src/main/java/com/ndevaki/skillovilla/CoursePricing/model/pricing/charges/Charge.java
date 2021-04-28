package com.ndevaki.skillovilla.CoursePricing.model.pricing.charges;

import javax.persistence.*;

import com.ndevaki.skillovilla.CoursePricing.model.Course;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="CHARGE_TYPE",discriminatorType=DiscriminatorType.STRING)
public abstract class Charge {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@ManyToOne
    @JoinColumn(name="course_id", nullable=false)
	Course course;
	
	
	public Charge(Course course) {
		super();
		this.course = course;
	}
	
	public abstract double getCharge();
}
