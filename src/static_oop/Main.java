package static_oop;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		A.__staticIntValue = 10;
		A b = new B();
		System.out.println("B static value:" + B.__staticIntValue);
		B.__staticIntValue = 20;
		System.out.println("A static value:" + A.__staticIntValue);
		System.out.println("B static value:" + B.__staticIntValue);
		a.mStatic();
		b.mStatic();
		// Aici functioneaza polimorfismul
		a.mDynamic();
		b.mDynamic();
	}

}
