package ch11.practice2;

import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry {
	private String name;
	private Vector directory = new Vector();
	
	public Directory(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		Iterator iterator = directory.iterator();
		
		while(iterator.hasNext()) {
			Entry entry = (Entry)iterator.next();
			size += entry.getSize();
		}
		return size;
	}
	
	@Override
	public Entry add(Entry entry) throws FileTreatmentException {
		directory.add(entry);
		return this;
	}

	@Override
	public void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		Iterator iterator = directory.iterator();
		while(iterator.hasNext()) {
			Entry entry = (Entry)iterator.next();
			entry.printList(prefix + "/" + name);
		}
	}
	
	public void printList() {
		
		Iterator iterator = directory.iterator();
		while(iterator.hasNext()) {
			Entry entry = (Entry)iterator.next();
			System.out.println(entry.printList(name) + "/" + this);
			entry.printList(prefix + "/" + name);
		}
	}
}
