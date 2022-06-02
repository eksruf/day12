package day12;

public class TestClass02 {
	private String str; //정보은닉, 외부접근 금지
	private int num;
	private String name;
	
	//set + 합성어(첫글자는 대문자)

	public void setStr() {}
	public void setNum() {}
	public void setName() {}
	
	public void getStr() {}
	public void getNum() {}
	
	public void setting(String s) {
		str=s;
	}
	public String getter() {
		return str;
	}
}
