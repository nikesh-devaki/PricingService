package com.ndevaki.skillovilla.CoursePricing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.ndevaki.skillovilla.CoursePricing.model.pricing.charges.Charge;

@NoRepositoryBean
public interface ChargeRepository extends CrudRepository<Charge,Integer> {

}
