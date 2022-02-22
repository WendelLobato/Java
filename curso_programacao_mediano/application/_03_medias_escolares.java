package application;

import java.util.Scanner;

import entities._03_student;

public class _03_medias_escolares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		_03_student student = new _03_student();

		student.name = sc.nextLine();
		System.out.println("You need to write your first grade");
		student.n1 = sc.nextDouble();
		System.out.println("You need to write your second grade");
		student.n2 = sc.nextDouble();
		System.out.println("You need to write your third grade");
		student.n3 = sc.nextDouble();

		System.out.println("Final Grade = " + student.Nota());

		if (student.Nota() < 60) {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f Points%n", student.PassorFailed());
		} else {
			System.out.println("PASS");
		}

		sc.close();
	}

}
