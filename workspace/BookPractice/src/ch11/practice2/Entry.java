package ch11.practice2;

import java.util.Vector;

public abstract class Entry {
	
	public abstract String getName();
	public abstract int getSize();
	public abstract void printList(String prefix);
	public Entry add(Entry entry)  throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	public String toString() {
		return getName() + "(" + getSize() + ")";
	}
}
