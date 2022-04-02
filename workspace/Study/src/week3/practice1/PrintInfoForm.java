package week3.practice1;

public class PrintInfoForm {
	private String university;
	private String studentID;
	private String name;
	
	//? 생성자 추가함 -> yes
	public PrintInfoForm(String university, String studentID, String name) {
		this.university = university;
		this.studentID = studentID;
		this.name = name;
	}
	public void squareBrackets() {
		System.out.println(" [" + university + ", " + studentID + ", " + name  + "]");
	}
	public void brace() {
		System.out.println(" {" + university + ", " + studentID + ", " + name  + "}");
	}
	
	public void parentheses() {
		System.out.println(" (" + university + ", " + studentID + ", " + name  + ")");
	}
}

