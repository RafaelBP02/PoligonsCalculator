package com.br.project;

import java.util.Scanner;

import com.br.project.Triangle.TriTypes;

public class Main {

	public static void main(String[] args) {
		
		CalculatorConfig calculator = new CalculatorConfig();
		
		
		while(calculator.getTurnOnOff()) {
		
			calculator.calculatorStart();
			
			Scanner in = new Scanner(System.in);
			
			calculator.calculatorMode(in.nextInt());
		}
		
		System.out.println("Exiting program...");		
	}

}
