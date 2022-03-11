package hw.ch01;

public class Book {
	private String name;
	private String author;
	
	public Book(String name, String author) {
		this.name = name;
		//������: å ���� �Ӽ��� �߰��Ѵ�.
		this.author = author;
	}
	
	public String getName() {
		return name;
	}
	
	//������: å�� ���ڸ� ��ȯ�ϴ� �޼ҵ�
	public String getAuthor() {
		return author;
	}
	
	//������: å �̸��� ���ڸ� ��ȯ�ϴ� �޼ҵ�
	public String bookInfo() {
		return name + " / " + author;
	}
}
