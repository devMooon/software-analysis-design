package week3.practice1;

public class MyFormA extends PrintInfoForm implements PrintMyInfo {
	//����� �̿��� �����
	public MyFormA(String university, String studentID, String name) {
		super(university, studentID, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printModeA() {
		// TODO Auto-generated method stub
		squareBrackets();
	}

	@Override
	public void printModeB() {
		// TODO Auto-generated method stub
		brace();
	}

	@Override
	public void printModeC() {
		// TODO Auto-generated method stub
		parentheses();
	}
}
