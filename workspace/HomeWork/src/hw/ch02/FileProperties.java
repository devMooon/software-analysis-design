package hw.ch02;

import java.io.*;
import java.util.*;


// Properties 클래스는, 이미 존재하는 클래스이다.
// FileProperties 클래스가 어댑터 역할을 한다.
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
    	properties.setProperty(key, value); // 상속받은 Properties 클래스의 메소드를 호출한다.
    }
    public String getValue(String key) {
        return properties.getProperty(key, ""); // 상속받은 Properties 클래스의 메소드를 호출한다.
    }
}
