package hw.ch04.tv;

public class TV_SeoYeonMun extends Product {
	
	TV_SeoYeonMun(String modelNo) {
		this.modelNo = modelNo;
	}
	public void use() {
		System.out.println("모델번호 " + modelNo + "인 TV를 사용합니다.");
	}
	public String getModelNo() {
		return modelNo;
	}
}
