package hw.ch01;

public class BookShelfIteratorBackward implements Iterator{
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIteratorBackward(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		
		//������: ���� ������ ������ �ε����� index�� �����Ѵ�.
		index = bookShelf.getLength() - 1;
	}
	
	@Override
	public Object next() {
		//������: ���� �ε����� å�� ��ȯ�ϰ�,
		//������: index�� �ϳ��� ���ҽ��� �������� ���� å�� ������ �� �ֵ��� �Ѵ�.
		return bookShelf.getBookAt(index--);
	}

	@Override
	public boolean hasNext() {
		//������: å�� ������ 0���� ������ ���̻� å�� ���� ��
		if(index < 0) return false;
		else return true;
	}

}
