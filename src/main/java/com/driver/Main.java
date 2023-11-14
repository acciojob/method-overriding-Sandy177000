
package com.driver;

public class Main {
	public Main() {
	}

	public static void main(String[] args) {
		A obj1 = new B();
		obj1.meth();
		B obj = new B();
		obj.meth();
	}

	public static class B extends A {
		public B() {
		}

		public String meth() {
			return "Method is overridden in Extended class B";
		}
	}

	public static class A {
		public A() {
		}

		public String meth() {
			return "Invoking method from class A";
		}
	}
}
