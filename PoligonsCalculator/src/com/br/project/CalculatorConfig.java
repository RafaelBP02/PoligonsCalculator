package com.br.project;

import java.util.Scanner;

import com.br.project.Triangle.TriTypes;

public class CalculatorConfig {
	
	private boolean turnOnOff;
	private int heigthRead;
	private int baseRead;
	
	public CalculatorConfig() {
		this.turnOnOff = true;
	}
	
	public void calculatorStart() {
		System.out.println("\n************************************");
		System.out.println("********POLIGON CALCULATOR**********");
		System.out.println("************************************");
		System.out.println("\nWhat poligon do you wish to calculate?");
		System.out.println("(1)Quadrilateral | (2)Triangle | (3)Exit");
	}
	
	public void calculatorMode(int mode) {
		switch (mode) {
		case 1:
			
			readBaseHeigthInput();
			if(this.baseRead<0 || this.heigthRead<0)
				throw new RuntimeException("PLEASE TYPE IN ONLY POSITIVE NUMBERS\n");
			else {
				Quadrilateral mySquare = new Quadrilateral(this.heigthRead, this.baseRead);
				
				mySquare.calcArea();
				mySquare.calcPerimeter();
			}
			
			break;
		
		case 2:
			
			readBaseHeigthInput();
			if(this.baseRead<0 || this.heigthRead<0)
				throw new RuntimeException("PLEASE TYPE IN ONLY POSITIVE NUMBERS\n");
			else {
				Triangle myTriangle = new Triangle(this.heigthRead, this.baseRead, TriTypes.RIGHT);
				
				myTriangle.calcArea();
				myTriangle.calcPerimeter();
			}
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
	
	private void readBaseHeigthInput() {
		System.out.println("Please type in the Poligon's heigth and base with one space in beteen.");
		
		Scanner in = new Scanner(System.in);
		
		this.heigthRead = in.nextInt();
		this.baseRead = in.nextInt();
		
	}

}
