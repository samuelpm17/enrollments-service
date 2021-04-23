package com.unosquare.learning.enrollmentsservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unosquare.learning.commons.learningcommons.model.entity.Enrollment;

@Repository
public interface EnrollmentRepository extends CrudRepository<Enrollment, Long>{

}
