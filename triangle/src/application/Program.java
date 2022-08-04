package application;

import java.util.Locale;
import entities.Triangle;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Medidas X: xA:10 xB:20 xC:30");
		x.a = 3.0;
		x.b = 4.0;
		x.c = 5.0;
		System.out.println("Medidas Y: yA:2 yB:4 yC: 6");
		y.a = 7.5;
		y.b = 4.5;
		y.c = 4.02;
		
		double areaX = x.area();
		double areaY = y.area();
			
		
		System.out.printf("Área do TriÂngulo X: %.4f%n", areaX);
		System.out.printf("Área do Triângulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A maior área é : X");
		}
		else {
			System.out.println("A maior área é: Y");
		}
		
	}
}