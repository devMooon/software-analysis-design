package hw.ch04.tv;

import java.util.Iterator;
import java.util.Vector;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class TVFactory extends Factory {
	private Vector modelNos; //문서연: 생산된 제품들의 모델번호들을 저장하는 변수
	
	public TVFactory() {
		modelNos = new Vector();
	}
	public Product createProduct(String model) {//문서연: factory method
		return new TV_SeoYeonMun(model);
	}
	public void registerProduct(Product product) {
		modelNos.add(((TV_SeoYeonMun)product).getModelNo());
	}
	public void printAllModelNumbers() {
		Iterator itr = modelNos.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
