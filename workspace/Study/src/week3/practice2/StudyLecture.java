package week3.practice2;

public abstract class StudyLecture {
	//? public?
	public abstract void WatchingLecture();
	public abstract void reviewOfStudy();
	public abstract void assignments();
	
	//final로 선언!!!!!!!!!, 하위클래스가 수정할 수 없도록
	public void display() {
		WatchingLecture();
	
		for(int i = 0; i < 3; i++) {
			reviewOfStudy();
		}
		
		assignments();
	}
}
