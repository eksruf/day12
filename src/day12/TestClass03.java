package day12;

public class TestClass03 {
	private String name;
	private int age;
	
	public void setAge(int age) {
		//this.age=age;
		op(age);
	}
	public int getAge() {//자신의 age가 없으므로 밖의 age의미한다
		return age;
	}
	
	//public void setting(){
	// age=age-1; }
	
	public void op(int age) {
		this.age=age-1;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}
	
	
	
	
}
