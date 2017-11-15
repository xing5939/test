package action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import service.StudentService;
import util.BaseAction;
import vo.Student;

@Controller("studentAction")
@Scope("prototype")
public class StudentAction extends BaseAction<Student> {

	@Resource
	private StudentService studentService;
	
	public void findAll(){
		System.out.println("&&&&&&&&");
		List<Student> list = null;
		
			list = studentService.find();
		
		System.out.println("***"+list);
		request.setAttribute("students", list);
	}
	
	public String save(){
		
		Student student = this.getModel();
		studentService.save(student);
		return "list";
	}
}
