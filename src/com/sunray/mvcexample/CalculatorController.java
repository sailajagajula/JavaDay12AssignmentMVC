package com.sunray.mvcexample;

public class CalculatorController {
	private CalculatorModel model;
	private CalculatorView view;

	public CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
	}

	public void getNum1() {
		model.getNum1();
	}

	public void setNum1(int num1) {
		model.setNum1(num1);
	}

	public void getNum2() {
		model.getNum2();
	}

	public void setNum2(int num2) {
		model.setNum2(num2);
	}

	public void updateView() {
		view.addNumbers(model.getNum1(), model.getNum2());
		view.subtractNumbers(model.getNum1(), model.getNum2());
		view.multiplyNumbers(model.getNum1(), model.getNum2());
		view.devideNumbers(model.getNum1(), model.getNum2());
	}

}
