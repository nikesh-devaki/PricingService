package com.ndevaki.skillovilla.CoursePricing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndevaki.skillovilla.CoursePricing.model.Course;
import com.ndevaki.skillovilla.CoursePricing.repository.CourseRepository;

@Service
public class PricingService {
	
	@Autowired
	CourseRepository courseRepository;

	public Course getPriceSummary(Integer id,String currency,String location) {

		Course course=courseRepository.findByIdAndCurrencyAndLocation(id,currency,location);
		System.out.println(course.getCharges().size()+" ---");
		return course;
	}

}
