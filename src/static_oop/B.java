package static_oop;

public class B extends A {
	public static int __staticIntValue;

	@Override
	public void mDynamic() {
		System.out.println("mDynamic definit in clasa B");
	}
	
	public static void mStatic() {
		System.out.println("mStatic definit in clasa B");
	}
}
