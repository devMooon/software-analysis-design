package hw.ch01;

public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		index = 0;
	}
	
	@Override
	public Object next() {
		return bookShelf.getBookAt(index++);
	}

	@Override
	public boolean hasNext() {
		if(index >= bookShelf.getLength()) return false;
		else return true;
	}

}
