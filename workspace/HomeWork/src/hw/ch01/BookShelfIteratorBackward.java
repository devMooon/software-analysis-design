package hw.ch01;

public class BookShelfIteratorBackward implements Iterator{
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIteratorBackward(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		
		//문서연: 가장 마지막 원소의 인덱스를 index에 저장한다.
		index = bookShelf.getLength() - 1;
	}
	
	@Override
	public Object next() {
		//문서연: 현재 인덱스의 책을 반환하고,
		//문서연: index는 하나를 감소시켜 다음번에 다음 책에 접근할 수 있도록 한다.
		return bookShelf.getBookAt(index--);
	}

	@Override
	public boolean hasNext() {
		//문서연: 책의 개수가 0보다 작으면 더이상 책이 없는 것
		if(index < 0) return false;
		else return true;
	}

}
