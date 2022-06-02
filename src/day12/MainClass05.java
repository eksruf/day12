package day12;
/*-
 생성자
 -클래스 이름과 동일한 메소드
 -반환타입은 없다.
 -값을 초기화하는 용도로 사용한다.
 -객체 생성시 호출되는 메소드이다.
 -생성자도 메소드 이기 때문에 오버로딩이 가능하다.
 */
class AAA{ //public을 적으면 오류발생, 하나의 파일에 클래스 생성은 가능
	private String version;
	public AAA() {//클래스 이름과 동일,반환타입(void) 없어야 함.
		System.out.println("생성자 실행");
	}
	public AAA(String v) {
		System.out.println(v+": v생성자");
		version=v;
	}
}

public class MainClass05 {
public static void main(String[] args) {
	AAA a = new AAA("10"); //객체 생성할 때 만들어짐
	AAA b = new AAA();
}
}
