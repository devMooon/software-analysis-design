package ch01;

public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		if(index >= bookShelf.getLength()) return false;
		else return true;
	}

	@Override
	public Object next() {
		return bookShelf.getBookAt(index++);
	}

}
