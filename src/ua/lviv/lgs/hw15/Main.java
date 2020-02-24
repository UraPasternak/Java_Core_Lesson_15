package ua.lviv.lgs.hw15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Zooclub club = new Zooclub();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("������ 1, ��� ������ �������� �����");
			System.out.println("������ 2, ��� ������ �������� �� �������� �����");
			System.out.println("������ 3, ��� �������� �������� � �������� �����");
			System.out.println("������ 4, ��� �������� �������� � �����");
			System.out.println("������ 5, ��� �������� ��������� ������� � ��� ��������");
			System.out.println("������ 6, ��� ������� �� ����� �������");
			System.out.println("������ 0, ��� �����");

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
