package hw.ch04.tv;

public class TV_SeoYeonMun extends Product {
	
	TV_SeoYeonMun(String modelNo) {
		this.modelNo = modelNo;
	}
	public void use() {
		System.out.println("�𵨹�ȣ " + modelNo + "�� TV�� ����մϴ�.");
	}
	public String getModelNo() {
		return modelNo;
	}
}
