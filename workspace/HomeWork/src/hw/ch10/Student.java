package hw.ch10;

public class Student implements Comparable {
	private String name;
	private String id;
	private int height;
	
	public Student(String name, String id, int height) {
		this.name = name;
		this.id = id;
		this.height = height;
	}
	@Override
	public int compareTo(Object o) {
		if(height > ((Student)o).height)
			return 1;
		else if(height < ((Student)o).height)
			return -1;
		else
			return 0;
	}
	
	public String toString() {
		return "이름: " + name + ", 학번: " + id + ", 키: " + height; 
	}

}
