package hw.ch01;

public class BookShelfIteratorBackward implements Iterator{
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIteratorBackward(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		index = bookShelf.getLength() - 1;
	}
	
	@Override
	public Object next() {
		return bookShelf.getBookAt(index--);
	}

	@Override
	public boolean hasNext() {
		if(index <= 0) return false;
		else return true;
	}

}
