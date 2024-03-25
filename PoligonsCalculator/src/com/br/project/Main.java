package com.br.project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		CalculatorConfig calculator = new CalculatorConfig();
		
		
		while(calculator.getTurnOnOff()) {
		
			calculator.calculatorStart();
			
			Scanner in = new Scanner(System.in);
			
			try{
				calculator.calculatorMode(in.nextInt());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		
		}
		
		System.out.println("Exiting program...");		
	}

}
