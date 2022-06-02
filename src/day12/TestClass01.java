package day12;

public class TestClass01 {
	public String str="인스턴스";
	
	public void setStr() {
		//안쪽에서 만든 값이 더 우선순위
		//this를 붙이면 밖에서 만든 내용 사용가능
		String str;
		str="문자열";
		System.out.println(this.str);
	}
	
	public void func() {
		System.out.println("func 실행");
		System.out.println(this);
		this.func02();
	}
	
	public void func02() {
		System.out.println("func02 실행");
	}
	
	public void func03() {
		System.out.println(str);
	}

	public void func04() {
		this.str = "반갑습니다.";
		func03();
	}

}
