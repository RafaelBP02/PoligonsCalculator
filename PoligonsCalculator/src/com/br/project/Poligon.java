package com.br.project;

public abstract class Poligon {
	protected int heigth;
	protected int base;
	private int area;
	private int perimeter;

	public Poligon() {
		this.area = -1;
		this.perimeter = -1;
	}
	
	abstract public void calcArea();
	
	abstract public void calcPerimeter();

	public int getArea() {
		return area;
	}

	public void setArea(int heigth) {
		this.area = heigth;
	}

	public int getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}

}


