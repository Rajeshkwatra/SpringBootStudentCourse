package com.school.service;

import java.util.*;

import com.school.entity.Student;
import com.school.exception.NoSuchCourseFoundException;
import com.school.exception.NoSuchStudentFoundException;

public interface StudentService {

	List<Student> getAllStudents();

	Student getStudentById(Long id) throws NoSuchStudentFoundException;

	Student createStudent(Student student);

	Student updateStudent(Long id, Student studentDetails) throws NoSuchStudentFoundException;

	void deleteStudent(Long id) throws NoSuchStudentFoundException;

	Student enrollStudentInCourse(Long studentId, Long courseId)
			throws NoSuchStudentFoundException, NoSuchCourseFoundException;

	Student dropCourse(Long studentId, Long courseId) throws NoSuchStudentFoundException, NoSuchCourseFoundException;
}
