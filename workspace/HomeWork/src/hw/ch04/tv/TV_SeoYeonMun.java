package hw.ch04.tv;

import hw.ch04.framework.Product;

public class TV_SeoYeonMun extends Product {
	private String modelNo;
	protected TV_SeoYeonMun(String modelNo) {
		this.modelNo = modelNo;
	}
	public void use() {
		System.out.println("�𵨹�ȣ " + modelNo + "�� TV�� ����մϴ�.");
	}
	public String getModelNo() {
		return modelNo;
	}
}
