package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;

public interface TrainerService {
	public String addCourse(Course course);
	
	public String saveCourse(Course course);
	
	public String addLesson(Lesson lesson);
	
	public Course getCourse(int courseId);
	
	public List<Course> courseList();
}