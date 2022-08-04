package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee funcionario = new Employee();
		
		System.out.println("Por favor digite o nome do funcionário");
		funcionario.name = sc.nextLine();
		System.out.println("Por favor digite o salário: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Digite o valor do imposto: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("Salario é de: " + funcionario.netSalary());
		
		System.out.println("Digite o valor do aumento percentual: ");
		double percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);
		
		System.out.println("O salário pós aumento é de: " + funcionario.netSalary());
		sc.close();
	}

}
