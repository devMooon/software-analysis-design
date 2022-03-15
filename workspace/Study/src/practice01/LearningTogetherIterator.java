package practice01;

public class LearningTogetherIterator implements Iterator {

	private  LearningTogether learningTogether;
	private int index;
	
	public LearningTogetherIterator(LearningTogether learningTogether) {
		this.learningTogether = learningTogether;
		index = 0;
	}
	@Override
	public boolean hasNext() {
		if(index >= learningTogether.getLength()) return false;
		else return true;
	}

	@Override
	public Object next() {
		return learningTogether.getStudentFrom(index++);
	}

}
