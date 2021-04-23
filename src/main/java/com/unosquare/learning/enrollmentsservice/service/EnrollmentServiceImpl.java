package com.unosquare.learning.enrollmentsservice.service;

import java.util.List;

import com.unosquare.learning.commons.learningcommons.model.entity.Enrollment;
import com.unosquare.learning.enrollmentsservice.repository.EnrollmentRepository;

public class EnrollmentServiceImpl implements EnrollmentService {

	private EnrollmentRepository enrollmentRepository;
	
	public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository) {
		this.enrollmentRepository = enrollmentRepository;
	}

	@Override
	public List<Enrollment> findAll() {
		return (List<Enrollment>) enrollmentRepository.findAll();
	}

	@Override
	public Enrollment findById(Long id) {
		return enrollmentRepository.findById(id).orElse(null);
	}

	@Override
	public Enrollment save(Enrollment enrollment) {
		return enrollmentRepository.save(enrollment);
	}

	@Override
	public void delete(Long id) {
		enrollmentRepository.deleteById(id);
	}

}
