package com.br.project;

import com.br.project.Poligon;

public class Quadrilateral extends Poligon{
		
	public Quadrilateral(int h, int b) {
		super();
		this.heigth = h;
		this.base = b;
	}
	
	@Override
	public void calcArea() {
		if(this.heigth < 0 || this.base < 0) {
			System.out.println("Error! Wrong values for base and heigth");
			return;
		}
		
		super.setArea(this.heigth * this.base);
		System.out.println("Quadrado possui area de: " + getArea() + " m2");
	}
	
	@Override
	public void calcPerimeter() {
		if(this.heigth < 0 || this.base < 0) {
			System.out.println("Error! Wrong values for base and heigth");
			return;
		}
		
		super.setPerimeter(this.heigth*2 + this.base*2);
		System.out.println("Quadrado possui perimetro de: " + getPerimeter() + " m");
	}
	
}
