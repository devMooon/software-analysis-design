package ch04.Sample;

import ch04.Sample.framework.Factory;
import ch04.Sample.framework.Product;
import ch04.Sample.idcard.IDCard;
import ch04.Sample.idcard.IDCardFactory;

public class Main2 {

	public static void main(String[] args) {
		//보통 이렇게 사용
		/*IDCard id01 = new IDCard("문서연");
		id01.use();
		System.out.println("ower: " + id01.getOwner());*/
		
		//공장을 세운다
		//IDCardFactory idCardFactory = new IDCardFactory();
		Factory factory = new IDCardFactory(); //더 확장성 있는 코드
		
		//공장을 통해서 idcard를 얻어온다.
		IDCard id02 = (IDCard)factory.create("문서연");
		Product pro01 = factory.create("문서연");
		
		pro01.use(); //Product에 있는 메소드라 사용 가능
		//pro01.getOwner(); //Product에 없는 메소드라 사용 불가능 따라서 형변환 필요
		System.out.println(((IDCard)pro01).getOwner()); //★형변환보다 .이 우선순위가 더 높기 때문에 괄호로 우선순위 변경★
		
	}

}
