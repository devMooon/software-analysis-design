package hw.ch05.idcard;

import hw.ch05.framework.Product;

public class IDCard extends Product {
	private int modelNum;
	
	public IDCard(int modelNum) {
		this.modelNum = modelNum;
	}
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println(modelNum + "번 IDCard를 사용합니다.");
	}

}
