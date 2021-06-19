package com.lgs.lab.interface2;

public class MyCalculator {
	int a;
	int b;

	public MyCalculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int plus() {
		return a + b;
	}

	public int minus() {
		return a - b;
	}

	public int multiple() {
		return a * b;
	}

	public int devide() {
		return a / b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	@Override
	public String toString() {
		return "MyCalculator [a=" + a + ", b=" + b + ", plus()=" + plus() + ", minus()=" + minus() + ", multiple()="
				+ multiple() + ", devide()=" + devide() + "]";
	}

}
