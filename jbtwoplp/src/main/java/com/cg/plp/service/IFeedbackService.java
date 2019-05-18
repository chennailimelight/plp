package com.cg.plp.service;

import java.util.List;

import com.cg.plp.model.Feedback;


public interface IFeedbackService {
	
	public List<Feedback> findAll();

	public void save(Feedback feedback);

	void sendToAdmin(Feedback feedback);

	

}
