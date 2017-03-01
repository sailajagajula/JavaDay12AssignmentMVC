package com.sunray.mvcexample;

public class CalculatorView {
	public void addNumbers(int num1, int num2) {
		System.out.println("" + num1 + " + " + num2 + " = " + (num1 + num2));
	}

	public void subtractNumbers(int num1, int num2) {
		System.out.println("" + num1 + " - " + num2 + " = " + (num1 - num2));
	}

	public void multiplyNumbers(int num1, int num2) {
		System.out.println("" + num1 + " * " + num2 + " = " + (num1 * num2));
	}

	public void devideNumbers(int num1, int num2) {
		System.out.println("" + num1 + " / " + num2 + " = " + (((float) num1) / num2));
	}

}
