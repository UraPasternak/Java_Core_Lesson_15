package ua.lviv.lgs.hw15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Zooclub club = new Zooclub();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Введіть 1, щоб додати учасника клубу");
			System.out.println("Введіть 2, щоб додати тваринку до учасника клубу");
			System.out.println("Введіть 3, щоб видалити тваринку з учасника клубу");
			System.out.println("Введіть 4, щоб видалити учасника з клубу");
			System.out.println("Введіть 5, щоб видалити конкретну тварину зі всіх власників");
			System.out.println("Введіть 6, щоб вивести на екран зооклуб");
			System.out.println("Введіть 0, щоб вийти");

			int i = scanner.nextInt();

			switch (i) {

			case 1: {
				Person per = new Person();
				club.addPersonClub(per);
				break;
			}

			case 2: {
				Animal a = new Animal();
				club.addAnimalPersonClub(a);
				break;
			}

			case 3: {
				club.dellAnimalPersonClub();
				break;
			}

			case 4: {
				club.dellPersonClub();
				break;
			}

			case 5: {
				club.dellAnimal();
				break;
			}

			case 6: {
				System.out.println(club.map);
				break;
			}

			case 0: {
				System.exit(0);
				break;
			}
			}

		}

	}

}
