package week3.practice1;

public class MyFormB implements PrintMyInfo {
	//위임을 이용한 어댑터
	private PrintInfoForm printInfoForm;
	
	//? 생성자에 매개변수 이렇게 하는 게 맞나?? -> Yes
	public MyFormB(String university, String studentID, String name) {
		printInfoForm = new PrintInfoForm(university, studentID, name);
	}
	@Override
	public void printModeA() {
		// TODO Auto-generated method stub
		printInfoForm.squareBrackets();
	}

	@Override
	public void printModeB() {
		// TODO Auto-generated method stub
		printInfoForm.brace();
	}

	@Override
	public void printModeC() {
		// TODO Auto-generated method stub
		printInfoForm.parentheses();
	}

}
