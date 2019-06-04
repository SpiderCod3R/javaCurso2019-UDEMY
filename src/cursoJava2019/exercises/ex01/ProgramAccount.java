package cursoJava2019.exercises.ex01;

import java.util.Locale;
import java.util.Scanner;

import cursoJava2019.exercises.ex01.entities.Account;


public class ProgramAccount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter the Account data: ");
		System.out.println();
		
		System.out.print("Enter the account number ");
		long number = sc.nextLong();
		
		sc.nextLine();
		
		System.out.print("Enter the account holder ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit? (y/N) ");
		char response = sc.next().charAt(0);
		
		if (response=='y' || response=='Y') {
			System.out.print("Enter the initial value: ");
			double initial_deposit = sc.nextDouble();
			account = new Account(holder, number, initial_deposit);
		}else {
			account = new Account(holder, number);
		}
		
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter the deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println();
		System.out.println("Updated Account Data: ");
		System.out.println(account);
		sc.nextLine();
		
		System.out.println();
		System.out.print("Enter the withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println();
		System.out.println("Updated Account Data: ");
		System.out.println(account);
		sc.nextLine();

		sc.close();

	}

}
