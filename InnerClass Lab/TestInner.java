package com.java.InnerClassDemo;
public class TestInner {

	public static void main(String[] args) {
		System.out.println("In instance inner class------");
		InstanceInnerClass.InsInCls i1 = new InstanceInnerClass().new InsInCls();
		i1.print();
		InstanceInnerClass i2 = new InstanceInnerClass();
		i2.useInnerClass();
		System.out.println("-----------------------------");
		System.out.println("In static inner class------");
		StaticInnerClass.stcInnrClss s1 = new StaticInnerClass.stcInnrClss();
		s1.print();
		StaticInnerClass s2 = new StaticInnerClass();
		s2.useInner();
		System.out.println("-----------------------------");
		System.out.println("In annonymous inner class------");
		AnnonymousInnerClass a1 = new AnnonymousInnerClass();
		a1.print();
		System.out.println("-----------------------------");
		System.out.println(Thread.currentThread().getName());
		System.out.println("-----------------------------");
		MethodLocalInnerClass m = new MethodLocalInnerClass();
		m.print();

		

	}

}
