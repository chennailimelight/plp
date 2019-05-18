package com.cg.plp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.plp.model.Feedback;

public interface FeedbackDao extends JpaRepository<Feedback,Integer> {

}
