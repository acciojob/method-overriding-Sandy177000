
package com.driver;

public class Main {
	public Main() {
	}

	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.meth());
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
