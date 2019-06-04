package cursoJava2019.exercises.ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import cursoJava2019.exercises.ex06.entities.Employee;

/**
 * 
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
	N funcionários. Não deve haver repetição de id.
	Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
	Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
	mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
	conforme exemplos.
	Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
	ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
	aumento por porcentagem dada.
 *
 */

public class ProgramListEmploye {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employee_list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n =sc.nextInt();
		sc.nextLine();
		Random rand = new Random();
		
		for (int x = 1; x <= n; x++) {
			System.out.println("Emplyoee #" + x + ": ");
			
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			employee_list.add(new Employee(id, name, salary));	
		}
		
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = employee_list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee x : employee_list) {
			System.out.println(x);
		}
		sc.close();

	}

}
