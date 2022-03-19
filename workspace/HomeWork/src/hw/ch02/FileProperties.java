package hw.ch02;

import java.io.*;
import java.util.*;


// Properties Ŭ������, �̹� �����ϴ� Ŭ�����̴�.
// FileProperties Ŭ������ ����� ������ �Ѵ�.
public class FileProperties implements FileIO {
	private Properties properties;
	
	public FileProperties() {
		properties = new Properties();
	}
    public void readFromFile(String filename) throws IOException {
    	properties.load(new FileInputStream(filename));
    }
    public void writeToFile(String filename) throws IOException {
    	properties.store(new FileOutputStream(filename), "written by FileProperties");
    }
    public void setValue(String key, String value) {
    	properties.setProperty(key, value); // ��ӹ��� Properties Ŭ������ �޼ҵ带 ȣ���Ѵ�.
    }
    public String getValue(String key) {
        return properties.getProperty(key, ""); // ��ӹ��� Properties Ŭ������ �޼ҵ带 ȣ���Ѵ�.
    }
}
