package service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import service.CourseService;
import vo.Course;

@Service("courseService")
@Transactional
public class CourseServiceImpl implements CourseService {

	@Override
	public List<Course> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Course object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Course object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Course object) {
		// TODO Auto-generated method stub

	}

}
