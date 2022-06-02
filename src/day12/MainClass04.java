package day12;

import java.util.Scanner;

public class MainClass04 {
public static void main(String[] args) {
	//국,영,수,합,평균
	//각 셋,겟 생성, 연산하는 메소드 생성
	TestClass04 t = new TestClass04();
	Scanner input = new Scanner(System.in);
	int kor,eng,math;
	
	
	System.out.println("국어 성적 입력: ");
	kor = input.nextInt();
	t.setKor(kor);
	System.out.println("영어 성적 입력: ");
	eng = input.nextInt();
	t.setEng(eng);
	System.out.println("수학 성적 입력: ");
	math = input.nextInt();
	t.setMath(math);
	
	t.setSum(); //합 세팅하기
	
	System.out.println("국어: "+t.getKor());
	System.out.println("영어: "+t.getEng());
	System.out.println("수학: "+t.getMath());
	System.out.println("성적의 합: "+t.getSum());
	System.out.println("성적의 평균: "+t.Avg());
	
	
}
}
