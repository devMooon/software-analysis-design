package hw.ch01;

public class Main {

	public static void main(String[] args) {
		System.out.println("20200675 ������\n");
		
		//������: �ִ� å�� 6�� ���� �� �ִ� å���̸� �����Ѵ�.
		BookShelf bookShelf = new BookShelf(6);
		
		//������ 6���� å�� �ȴ´�.
		bookShelf.appendBook(new Book("�ڷᱸ����", "�ڿ�â"));
		bookShelf.appendBook(new Book("����Ʈ����м�����", "�ֽ���"));
		bookShelf.appendBook(new Book("���α׷��Ӽ���", "���ֿ�"));
		bookShelf.appendBook(new Book("��ǻ�͵��ۿ���", "���߾�"));
		bookShelf.appendBook(new Book("��ǻ�ͱ׷��Ƚ�", "�̰��"));
		bookShelf.appendBook(new Book("������Ǫ, �ູ�� ���� �����־�", "������"));
		
		//������: å������ å�� �������� ������ iterator�� ������.
		Iterator itr = bookShelf.iteratorBackward();
		
		//������ iterator�� �̿��� å�� ������ ���������� ����Ѵ�.
		while(itr.hasNext()) {
			System.out.println(((Book)itr.next()).bookInfo());
		}
	}

}
