package ch04.Sample.idcard;

import ch04.Sample.framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
	// Vector�� �迭�� ��������� ��ü ũ�Ⱑ ������ ���� �ʰ�
	// ���Ҹ� �߰��ϸ� �ʿ��� ��� ũ�Ⱑ �þ��.
    private Hashtable<String, Integer> owner_serial = new Hashtable<String, Integer>();
    private int serial = 100;

	// �� ������ ��ǰ�� IDCard�� �����Ѵ�.
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

	// ����� ��ǰ�� owner�� ���(�߰�)�Ѵ�.
    protected void registerProduct(Product product) {
        // product �� IDCard�� ����ȯ�ؾ�, getOwner()�� ȣ���� �� �ִ�.
    	owner_serial.put(((IDCard)product).getOwner(), serial++);
    }
    public Hashtable getOwners() {
        return owner_serial;
    }
}
