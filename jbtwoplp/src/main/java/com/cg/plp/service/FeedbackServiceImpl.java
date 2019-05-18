package com.cg.plp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.plp.dao.FeedbackDao;
import com.cg.plp.model.Feedback;



@Service("feedbackService")
public class FeedbackServiceImpl implements IFeedbackService {

	@Autowired
	private FeedbackDao feedbackDao;
	
	@Autowired
	private IAdminService adminService;

	@Override
	public List<Feedback> findAll() {
		List<Feedback> feedbacklist = feedbackDao.findAll();
		return feedbacklist;

	}

	@Override
	public void save(Feedback feedback) {
		feedbackDao.save(feedback);
		this.sendToAdmin(feedback);

	}

	@Override
	public void sendToAdmin(Feedback feedback) {
		adminService.sendFeedback(feedback);
	}
}