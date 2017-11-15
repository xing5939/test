package action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import service.CourseService;
import util.BaseAction;
import vo.Course;

@Controller("courseAction")
@Scope("prototype")
public class CourseAction extends BaseAction<Course> {

	@Resource
	private CourseService courseService;
}
