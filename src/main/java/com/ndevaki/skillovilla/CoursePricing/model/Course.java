package com.ndevaki.skillovilla.CoursePricing.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PostLoad;
import javax.persistence.Transient;

import com.ndevaki.skillovilla.CoursePricing.model.pricing.charges.Charge;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Column(nullable = false)
	String name;
	
	@Column(nullable = false)
	String description;
	
	@Column(nullable = false)
	double basePrice;
	
	@Column(nullable = false)
	@Enumerated(value=EnumType.STRING)
	PricingStrategy pricingStrategy;
	
	@OneToMany(mappedBy="course")
	Set<Charge> charges;
	
	@Transient
	double totalPrice=0;
	
	public enum PricingStrategy{
		FREE_PRICING("Free"),
		ONETIME_PAYMENT("One Time Payment"),
		SUBSCRIPTION("Subscription");
		
		private String label;
		
		PricingStrategy(String label) {
			this.label=label;
		}
		public String getLabel() {
			return this.label;
		}
	}

	public Course() {
		
	}
	
	public Course(int id, String name, String description, double basePrice, PricingStrategy pricingStrategy,
			Set<Charge> charges) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.basePrice = basePrice;
		this.pricingStrategy = pricingStrategy;
		this.charges = charges;
	}

	@PostLoad
	public void loadTotalPrice() {
	    this.totalPrice=this.basePrice+this.charges
				  .stream()
				  .mapToDouble(charge ->charge.getCharge())
				  .sum();
	}
	
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public String getPricingStrategy() {
		return pricingStrategy.getLabel();
	}

	public void setPricingStrategy(PricingStrategy pricingStrategy) {
		this.pricingStrategy = pricingStrategy;
	}

	public Set<Charge> getCharges() {
		return charges;
	}

	public void setCharges(Set<Charge> charges) {
		this.charges = charges;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	
}
