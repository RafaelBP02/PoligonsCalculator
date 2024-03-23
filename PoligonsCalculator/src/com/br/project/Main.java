package com.br.project;

import com.br.project.Triangle.TriTypes;

public class Main {

	public static void main(String[] args) {
		
		Quadrilateral mySquare = new Quadrilateral(10, 15);
		
		mySquare.calcArea();
		
		mySquare.calcPerimeter();
		
		Triangle myTriangle = new Triangle(10, 50, TriTypes.RIGHT);
		
		myTriangle.calcArea();
		
		myTriangle.calcPerimeter();
		
	}

}
