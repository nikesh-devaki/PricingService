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
	@Column(nullable = false)
	String name;
	public Charge() {
		
	}
	public Charge(Course course) {
		super();
		this.course = course;
	}
	
	public abstract double getCharge();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
