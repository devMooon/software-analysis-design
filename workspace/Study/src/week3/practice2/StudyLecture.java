package week3.practice2;

public abstract class StudyLecture {
	//? public?
	public abstract void WatchingLecture();
	public abstract void reviewOfStudy();
	public abstract void assignments();
	
	//final�� ����!!!!!!!!!, ����Ŭ������ ������ �� ������
	public void display() {
		WatchingLecture();
	
		for(int i = 0; i < 3; i++) {
			reviewOfStudy();
		}
		
		assignments();
	}
}
