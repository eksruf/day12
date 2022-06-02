package day12;

import java.util.Scanner;

public class MainClass03 {
public static void main(String[] args) {
	
	TestClass03 t = new TestClass03();
	Scanner input = new Scanner(System.in);
	System.out.println("이름 입력");
	String name = input.next();
	t.setName(name);
	
	System.out.println("당신 이름: "+t.getName());
	
	/*
	 나이도 저장하는 기능을 만들어 주세요
	 set, get 메소드 생성
	 그리고 나이를 만으로 연산하는 메소드도 만들어 주세요
	 입력: 나이 입력 20
	 츨력: 나이는 : 19세 이군요
	 
	 기능: set, get, op(만계산)
	 */
	
	
	System.out.println("나이 입력: ");
	int age = input.nextInt();
	t.setAge(age);
	//t.setting(); 만으로 계산하기
	System.out.println("나이는 "+t.getAge()+"세 이군요");
	
	
	
	
	
}
}
