package com.br.project;

public abstract class Poligon {
	protected int heigth;
	protected int base;
	protected int area;
	protected int perimeter;
	
	public Poligon() {
		this.area = -1;
		this.perimeter = -1;
	}
	
	abstract public void calcArea();
}
