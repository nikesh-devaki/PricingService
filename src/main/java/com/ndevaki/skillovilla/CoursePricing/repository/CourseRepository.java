package com.ndevaki.skillovilla.CoursePricing.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ndevaki.skillovilla.CoursePricing.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course,Integer>{

	@Query("SELECT c.id FROM  Course c INNER JOIN Charge ch on ch.course=c.id "
			+ "WHERE c.id = :id and ch.currency=:currency and ch.location=:location")
	Integer findByIdAndCurrencyAndLocation(@Param("id") Integer courseId,
													  @Param("currency") String currency,
													  @Param("location") String location);
	Optional<Course> findById(Integer id);
}
