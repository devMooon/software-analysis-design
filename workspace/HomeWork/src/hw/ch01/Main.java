package hw.ch01;

public class Main {

	public static void main(String[] args) {
		System.out.println("20200675 문서연\n");
		
		BookShelf bookShelf = new BookShelf(6);
		
		bookShelf.appendBook(new Book("자료구조론", "박우창"));
		bookShelf.appendBook(new Book("소프트웨어분석설계", "최승훈"));
		bookShelf.appendBook(new Book("프로그래머수학", "이주영"));
		bookShelf.appendBook(new Book("컴퓨터동작원리", "유견아"));
		bookShelf.appendBook(new Book("컴퓨터그래픽스", "이경미"));
		bookShelf.appendBook(new Book("곰돌이푸, 행복한 일은 매일있어", "문서연"));
		

		Iterator itr = bookShelf.iteratorBackward();
		
		while(itr.hasNext()) {
			System.out.println(((Book)itr.next()).bookInfo());
		}
	}

}
