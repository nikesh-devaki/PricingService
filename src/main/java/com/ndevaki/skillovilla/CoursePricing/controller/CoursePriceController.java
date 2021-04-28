package com.ndevaki.skillovilla.CoursePricing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ndevaki.skillovilla.CoursePricing.model.Course;
import com.ndevaki.skillovilla.CoursePricing.service.PricingService;

@RestController
@RequestMapping("/course/")
public class CoursePriceController {

	@Autowired
	PricingService pricingService;
	
	@GetMapping("{id}/price")
	@ResponseBody
	public Course getCoursePriceSummary(@PathVariable("id")final Integer courseId,
										@RequestParam String currency,
										@RequestParam String location) {
		return pricingService.getPriceSummary(courseId,currency,location);
	}
}
