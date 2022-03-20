package ch04.Sample;

import ch04.Sample.framework.Factory;
import ch04.Sample.framework.Product;
import ch04.Sample.idcard.IDCard;
import ch04.Sample.idcard.IDCardFactory;

public class Main2 {

	public static void main(String[] args) {
		//���� �̷��� ���
		/*IDCard id01 = new IDCard("������");
		id01.use();
		System.out.println("ower: " + id01.getOwner());*/
		
		//������ �����
		//IDCardFactory idCardFactory = new IDCardFactory();
		Factory factory = new IDCardFactory(); //�� Ȯ�强 �ִ� �ڵ�
		
		//������ ���ؼ� idcard�� ���´�.
		IDCard id02 = (IDCard)factory.create("������");
		Product pro01 = factory.create("������");
		
		pro01.use(); //Product�� �ִ� �޼ҵ�� ��� ����
		//pro01.getOwner(); //Product�� ���� �޼ҵ�� ��� �Ұ��� ���� ����ȯ �ʿ�
		System.out.println(((IDCard)pro01).getOwner()); //������ȯ���� .�� �켱������ �� ���� ������ ��ȣ�� �켱���� �����
		
	}

}
