package hw.ch01;

public class Main {

	public static void main(String[] args) {
		System.out.println("20200675 ������\n");
		
		BookShelf bookShelf = new BookShelf(6);
		
		bookShelf.appendBook(new Book("�ڷᱸ����", "�ڿ�â"));
		bookShelf.appendBook(new Book("����Ʈ����м�����", "�ֽ���"));
		bookShelf.appendBook(new Book("���α׷��Ӽ���", "���ֿ�"));
		bookShelf.appendBook(new Book("��ǻ�͵��ۿ���", "���߾�"));
		bookShelf.appendBook(new Book("��ǻ�ͱ׷��Ƚ�", "�̰��"));
		bookShelf.appendBook(new Book("������Ǫ, �ູ�� ���� �����־�", "������"));
		

		Iterator itr = bookShelf.iteratorBackward();
		
		while(itr.hasNext()) {
			System.out.println(((Book)itr.next()).bookInfo());
		}
	}

}
