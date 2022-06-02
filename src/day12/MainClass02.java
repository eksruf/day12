package day12;

public class MainClass02 {
public static void main(String[] args) {
	TestClass02 t = new TestClass02();
//	t.str="¾È³çÇÏ¼¼¿ä";

	t.setting("È«±æµ¿");
	String s = t.getter();
		System.out.println(s);
}
}
