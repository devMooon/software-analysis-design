package hw.ch05;

import hw.ch05.idcard.IDCardFactoryMunSeoYeon1;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("20200675 ������");
		IDCardFactoryMunSeoYeon1 factory1 = IDCardFactoryMunSeoYeon1.getInstance();
		IDCardFactoryMunSeoYeon1 factory2 = IDCardFactoryMunSeoYeon1.getInstance();
		
		if(factory1 == factory2)
			System.out.println("factory1�� factory2�� ���� �ν��Ͻ� �Դϴ�");
	}

}
