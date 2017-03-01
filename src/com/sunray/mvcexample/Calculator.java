package com.sunray.mvcexample;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();
		CalculatorController controller = setNumbers(model, view);
		controller.updateView();

	}

	public static CalculatorController setNumbers(CalculatorModel model, CalculatorView view) {
		CalculatorController controller = new CalculatorController(model, view);
		controller.setNum1(34);
		controller.setNum2(56);
		return controller;
	}

}
