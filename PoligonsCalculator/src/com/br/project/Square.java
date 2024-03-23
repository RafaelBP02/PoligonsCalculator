package com.br.project;

import com.br.project.Poligon;

public class Square extends Poligon{
	
	
	
	public Square(int h, int b) {
		super();
		this.heigth = h;
		this.base = b;
	}
	
	@Override
	public void calcArea() {
		if(this.heigth < 0 || this.base < 0) {
			System.out.println("Error! Wrong values for base and heigth");
		}
	}
}
