package practice01;

//집합체는 자기 원소들을 돌아다닐 Iterator 객체를 반환하는 
//iterator( ) 메소드를 가진다.

public interface Aggregate {
//이 집합체의 Iterator를 반환하는 메소드 
 public abstract Iterator iterator();
}