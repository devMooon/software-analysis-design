package week3.practice1;

public class MyFormB implements PrintMyInfo {
	//������ �̿��� �����
	private PrintInfoForm printInfoForm;
	
	//? �����ڿ� �Ű����� �̷��� �ϴ� �� �³�?? -> Yes
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
