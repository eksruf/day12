package day12;

import java.util.Scanner;

public class MainClass04 {
public static void main(String[] args) {
	//��,��,��,��,���
	//�� ��,�� ����, �����ϴ� �޼ҵ� ����
	TestClass04 t = new TestClass04();
	Scanner input = new Scanner(System.in);
	int kor,eng,math;
	
	
	System.out.println("���� ���� �Է�: ");
	kor = input.nextInt();
	t.setKor(kor);
	System.out.println("���� ���� �Է�: ");
	eng = input.nextInt();
	t.setEng(eng);
	System.out.println("���� ���� �Է�: ");
	math = input.nextInt();
	t.setMath(math);
	
	t.setSum(); //�� �����ϱ�
	
	System.out.println("����: "+t.getKor());
	System.out.println("����: "+t.getEng());
	System.out.println("����: "+t.getMath());
	System.out.println("������ ��: "+t.getSum());
	System.out.println("������ ���: "+t.Avg());
	
	
}
}
