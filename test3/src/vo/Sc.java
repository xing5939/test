package vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Sc entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sc", catalog = "tt")
public class Sc implements java.io.Serializable {

	// Fields

	private Integer id;
	private Course course;
	private Student student;

	// Constructors

	/** default constructor */
	public Sc() {
	}

	/** minimal constructor */
	public Sc(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Sc(Integer id, Course course, Student student) {
		this.id = id;
		this.course = course;
		this.student = student;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseId")
	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "studentId")
	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}