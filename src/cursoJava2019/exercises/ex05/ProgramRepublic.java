package cursoJava2019.exercises.ex05;

import java.util.Locale;
import java.util.Scanner;

import cursoJava2019.exercises.ex05.entities.Course;
import cursoJava2019.exercises.ex05.entities.Student;

/**
 *  A dona de um pensionato possui dez quartos para alugar para estudantes,
	sendo esses quartos identificados pelos números 0 a 9.
	
	Fazer um programa que inicie com todos os dez quartos vazios, e depois
	leia uma quantidade N representando o número de estudantes que vão
	alugar quartos (N pode ser de 1 a 10).
	
	Em seguida, registre o aluguel dos N estudantes. Para cada registro de 
	aluguel, informar o nome e email do estudante, bem como qual dos quartos 
	ele escolheu (de 0 a 9). 
	Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
	um relatório de todas ocupações do pensionato, por ordem de quarto,
	conforme exemplo.
**/


public class ProgramRepublic {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student rooms[] = new Student[10];
		
		System.out.println("Welcome to Avengers Republic.");
		System.out.printf("There are " + rooms.length +" rooms available.");
		
		System.out.println("\n");
		System.out.print("Type number of rooms for rent: ");
		Integer number_of_rooms =sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < number_of_rooms; i++) {
			System.out.print("Type the name of the Student: ");
			String name = sc.nextLine();
			System.out.print("Type the Email of the Student: ");
			String email= sc.nextLine();
			System.out.print("Type the course of the Student: ");
			String course_name=sc.nextLine();
			System.out.print("Type the Number of the room: ");
			Integer room_number =sc.nextInt();
			
			Course course = new Course(course_name);
			rooms[room_number]= new Student(name, email, course);
			sc.nextLine();
			System.out.println();
		}
		
		System.out.println("\nBusy Rooms: ");		
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(i + " - " + rooms[i]);
			}
		}
		
		sc.close();
	}

}
