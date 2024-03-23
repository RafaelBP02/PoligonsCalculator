package com.br.project;



public class Triangle extends Poligon {
	public static enum TriTypes{
		ISOSCELES, RIGHT, EQUILATERAL, SCALENE;
	}
	
	private TriTypes myType;
	
	public Triangle(int b, int h, TriTypes tt) {
		super();
		this.base = b;
		this.heigth = h;
		this.myType = tt;
	}
	
	@Override
	public void calcArea() {
		if(this.heigth < 0 || this.base < 0) {
			System.out.println("Error! Wrong values for base and heigth");
			return;
		}
		
		super.setArea((this.base * this.heigth)/2);
		
		System.out.println("Triangle area = " + getArea() + " m2");
	}
	
	@Override
	public void calcPerimeter() {
		if(this.heigth < 0 || this.base < 0) {
			System.out.println("Error! Wrong values for base and heigth");
			return;
		}
		
		if(this.myType == TriTypes.RIGHT) {
			super.setPerimeter(this.heigth + this.base + (int)Math.sqrt(this.heigth * this.heigth + this.base * this.base));
			System.out.println("Triangle perimeter = " + getPerimeter() + " m");
			
			return;
		}
		else {
			System.out.println("Not implemented perimeter for " + this.myType.toString() + " triangle");
			return;
		}
		
	}
	
}
