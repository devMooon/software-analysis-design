package hw.ch01;

public class Book {
	private String name;
	private String author;
	
	public Book(String name, String author) {
		this.name = name;
		//문서연: 책 저자 속성을 추가한다.
		this.author = author;
	}
	
	public String getName() {
		return name;
	}
	
	//문서연: 책의 저자를 반환하는 메소드
	public String getAuthor() {
		return author;
	}
	
	//문서연: 책 이름과 저자를 반환하는 메소드
	public String bookInfo() {
		return name + " / " + author;
	}
}
