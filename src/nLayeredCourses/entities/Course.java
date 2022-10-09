package nLayeredCourses.entities;

public class Course {
	private int id;
	private String courseName;
	private double price;
	public Course() {
		
	}
	public Course(int id, String courseName, double price) {
		
		this.id = id;
		this.courseName = courseName;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getCourseName() {
		return courseName;
	}
	public double getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
