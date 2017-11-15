package service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import service.StudentService;
import vo.Student;
import dao.StudentDAO;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentDAO studentDAO;
	
	@Override
	public List<Student> find() {
		// TODO Auto-generated method stub
		System.out.println("000000000");
		System.out.println("^^^"+studentDAO.find());
		return studentDAO.find();
	}

	@Override
	public void delete(Student object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Student object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Student object) {
		// TODO Auto-generated method stub

	}

}
