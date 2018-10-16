package daysix.OOP3;

public class Demo implements MyInterface, MyInterface2 {

	@Override
	public void method1() {
		System.out.println("Implementation of method 1");
	}

	@Override
	public void method2() {
		System.out.println("Implementation of method 2");

	}

	public static void main(String[] args) {

		MyInterface obj = new Demo();
		obj.method1();
		obj.method2();

		MyInterface2 obj1 = new Demo();
		obj1.method3();
		obj1.method2();

		SampleInterface sbj = new SampleTestClass();
		sbj.methodTwo();
		sbj.methodOne();

		InfoInterface lbj = new SampleTestClass();
		lbj.methodThree();

	}

	@Override
	public void method3() {
		System.out.println("Implementation of method 3");

	}

}

interface MyInterface {

	public void method1();

	public void method2();
}

interface MyInterface2 extends MyInterface {

	public void method3();

}