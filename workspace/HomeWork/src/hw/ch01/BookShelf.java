package hw.ch01;

public class BookShelf implements Aggregate {
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxSize) {
		books = new Book[maxSize];
	}
	
	public Book getBookAt(int index) {
		return books[index];

	}
	public void appendBook(Book book) {
		books[last++] = book;
	}
	public int getLength() {
		return last;
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

	//문서연: 거꾸로 책을 꺼내는 BookShelfIteratorBackward객체 생성 메소드
	@Override
	public Iterator iteratorBackward() {
		return new BookShelfIteratorBackward(this);
	}
	
	
}
