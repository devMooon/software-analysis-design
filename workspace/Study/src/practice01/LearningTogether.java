package practice01;

public class LearningTogether implements Aggregate {
	private Student[] students;
	private int last;
	
	public LearningTogether(int maxsize) {
		students = new Student[maxsize];
		last = 0;
	}
	public Student getStudentFrom(int index) {
		return students[index];
	}
	public void appendStudent(Student student) {
		students[last++] = student;
	}
	public int getLength() {
		return last;
	}
	@Override
	public Iterator iterator() {
		return new LearningTogetherIterator(this);
	}
}
