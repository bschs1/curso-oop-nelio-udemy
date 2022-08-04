package entities;

public class Retangulo {
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (2 * width ) + (2 * height);
	}
	
	public double diagonal() {
		double potenciaWidth = (width * width);
		double potenciaHeight = (height * height);
		double resultado = Math.sqrt(potenciaWidth + potenciaHeight);
		return resultado;
	}
}
