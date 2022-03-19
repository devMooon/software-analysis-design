package hw.ch04.tv;

import java.util.Iterator;
import java.util.Vector;

public class TVFactory extends Factory {
	private Vector modelNos; //������: ����� ��ǰ���� �𵨹�ȣ���� �����ϴ� ����
	
	public TVFactory() {
		modelNos = new Vector(4);
	}
	public Product createProduct(String model) {
		return new TV_SeoYeonMun(model);
	}
	public void registerProduct(Product product) {
		modelNos.add(product.getModelNo());
	}
	public void printAllModelNumbers() {
		Iterator itr = modelNos.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
