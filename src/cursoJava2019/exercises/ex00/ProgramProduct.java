package cursoJava2019.exercises.ex00;

import java.util.Locale;
import java.util.Scanner;

import cursoJava2019.exercises.ex00.entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter the Product data: ");
		System.out.print("Name: ");
		product.setName(sc.nextLine());
		System.out.print("Price: ");
		product.setPrice(sc.nextDouble());

		System.out.println();
		System.out.println("Product Data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added to stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated Data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated Data: " + product);
		
		sc.close();

	}

}
