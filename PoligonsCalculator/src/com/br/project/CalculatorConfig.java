package com.br.project;

import com.br.project.Triangle.TriTypes;

public class CalculatorConfig {
	
	private boolean turnOnOff;
	
	public CalculatorConfig() {
		this.turnOnOff = true;
	}
	
	public void calculatorStart() {
		System.out.println("************************************");
		System.out.println("********POLIGON CALCULATOR**********");
		System.out.println("************************************");
		System.out.println("\nWhat poligon do you wish to calculate?");
		System.out.println("(1)Quadrilateral | (2)Triangle | (3)Exit");
	}
	
	public void calculatorMode(int mode) {
		switch (mode) {
		case 1:
			Quadrilateral mySquare = new Quadrilateral(10, 15);
			
			mySquare.calcArea();
			mySquare.calcPerimeter();
			
			break;
		
		case 2:
			
			Triangle myTriangle = new Triangle(10, 50, TriTypes.RIGHT);
			
			myTriangle.calcArea();
			
			myTriangle.calcPerimeter();
			
			break;
			
		case 3:
			
			this.turnOnOff = false;
			return;
			
		default:
			calculatorStart();
			break;
		}
	}
	
	public boolean getTurnOnOff(){
		return turnOnOff;
	}

}
