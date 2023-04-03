package myproject;
class test{
	public test(){
	System.out.println("Hi from Constructor");
}
	public test(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
}



public class Testconstruction {

	public static void main(String[] args) {
		new test();
		new test(12, 15);

	}

}
