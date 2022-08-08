package application;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();
		retangulo.height = 4.00;
		retangulo.width = 3.00;
		System.out.println(retangulo.area());
		System.out.println(retangulo.perimeter());
		System.out.println(retangulo.diagonal());

	}

}
