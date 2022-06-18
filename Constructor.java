package Harish123;

public class Constructor {
	public int StudentId;
	public String StudentName;
	public String courseName;
	public int marks;
	private String grade;
	Constructor(){
		System.out.println("This is Default Constructor");
		
	
	}
	public Constructor(int studentId, String studentName, String courseName, int marks) {
	this();
		StudentId = studentId;
		StudentName = studentName;
		this.courseName = courseName;
		this.marks = marks;
	}
	public Constructor(Constructor c,String grade) {
		this.grade=grade;
		
		
	}
	public String grade() {
		String result="";
		if(marks>=90) {
			result="A grade";
		}
			else {
			result ="B grade";
		}
		return result;
		}
	
	
	public static void main(String[] args) {
		Constructor c=new Constructor(123,"Harish","Mca",60);
		System.out.println("StudentId :"+c.StudentId);
		System.out.println("StudentName :"+c.StudentName);
		System.out.println("Student Course Name :"+c.courseName);
		System.out.println("Student Marks:"+c.marks);
		System.out.println("Student grade :"+c.grade());
		
		
	}
		

	

}
