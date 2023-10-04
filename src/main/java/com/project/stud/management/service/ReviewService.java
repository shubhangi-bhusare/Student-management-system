package com.project.stud.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.stud.management.entity.Review;
import com.project.stud.management.repository.ReviewRepository;

@Service
public class ReviewService 
{
	@Autowired
	private ReviewRepository reviewRepository;
	
	public Review findById(int id) {
		return reviewRepository.findById(id).get();
	}
	
	@Transactional
	public Review save(Review review) {
		return reviewRepository.save(review);
	}
	
	@Transactional
	public void remove(Review review) {
		reviewRepository.delete(review);
	}
}
