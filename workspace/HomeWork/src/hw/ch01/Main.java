package hw.ch01;

public class Main {

	public static void main(String[] args) {
		System.out.println("20200675 문서연\n");
		
		//문서연: 최대 책을 6개 꽂을 수 있는 책꽂이를 생성한다.
		BookShelf bookShelf = new BookShelf(6);
		
		//문서연 6권의 책을 꽂는다.
		bookShelf.appendBook(new Book("자료구조론", "박우창"));
		bookShelf.appendBook(new Book("소프트웨어분석설계", "최승훈"));
		bookShelf.appendBook(new Book("프로그래머수학", "이주영"));
		bookShelf.appendBook(new Book("컴퓨터동작원리", "유견아"));
		bookShelf.appendBook(new Book("컴퓨터그래픽스", "이경미"));
		bookShelf.appendBook(new Book("곰돌이푸, 행복한 일은 매일있어", "문서연"));
		
		//문서연: 책꽂이의 책을 역순으로 꺼내는 iterator를 꺼낸다.
		Iterator itr = bookShelf.iteratorBackward();
		
		//문서연 iterator를 이용해 책의 정보를 순차적으로 출력한다.
		while(itr.hasNext()) {
			System.out.println(((Book)itr.next()).bookInfo());
		}
	}

}
