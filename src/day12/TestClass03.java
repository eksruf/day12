package day12;

public class TestClass03 {
	private String name;
	private int age;
	
	public void setAge(int age) {
		//this.age=age;
		op(age);
	}
	public int getAge() {//�ڽ��� age�� �����Ƿ� ���� age�ǹ��Ѵ�
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
