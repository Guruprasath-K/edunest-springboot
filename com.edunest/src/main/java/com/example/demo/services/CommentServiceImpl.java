package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Comments;
import com.example.demo.repository.CommentsRepository;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentsRepository commentRepo;
	@Override
	public List<Comments> commentList() {
		return commentRepo.findAll();
	}
	@Override
	public String addComment(Comments comment) {
		commentRepo.save(comment);
		return "comment added";
	}

}
