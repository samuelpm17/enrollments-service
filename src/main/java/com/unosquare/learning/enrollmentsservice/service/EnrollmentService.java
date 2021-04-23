package com.unosquare.learning.enrollmentsservice.service;

import java.util.List;

import com.unosquare.learning.commons.learningcommons.model.entity.Enrollment;

public interface EnrollmentService {

	public List<Enrollment> findAll();

	public Enrollment findById(Long id);

	public Enrollment save(Enrollment enrollment);

	public void delete(Long id);

}
