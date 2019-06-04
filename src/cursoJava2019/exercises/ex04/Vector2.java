package cursoJava2019.exercises.ex04;

import java.util.Locale;
import java.util.Scanner;

import cursoJava2019.exercises.ex00.entities.Product;

/**
 * 
 * Fazer um programa para ler um número inteiro N e os dados (nome e
   preço) de N Produtos. Armazene os N produtos em um vetor. Em
   seguida, mostrar o preço médio dos produtos.
 *
 */

public class Vector2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type an value for (n) ");
		int  n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Type a Product Name : ");
			String name =sc.nextLine();
			System.out.print("Type a Product price U$$ ");
			double price=sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		
		System.out.printf("The sum of all Products is: %.2f%n", sum);
		System.out.printf("The average price is R$: %.2f%n", avg);
		
		
		sc.close();
	}

}
