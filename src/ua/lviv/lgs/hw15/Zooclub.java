package ua.lviv.lgs.hw15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Zooclub {
	Map<Person, List<Animal>> map = new HashMap<>();

	public void addPersonClub(Person per) {
		map.put(per, per.getAnimal());
		System.out.println("�������� ������!");
	}

	public void addAnimalPersonClub(Animal a) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ��� �������� �����, ����� ������ �������");
		String s = scan.next();
		for (Person per : map.keySet()) {
			if (per.getName().equals(s)) {
				per.animal.add(a);
				System.out.println("�������� ������");
			} else {
				System.out.println("������ �������� �� ����");
			}
		}
	}

	public void dellAnimalPersonClub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ��� �������� �����");
		String nameu = scan.next();
		System.out.println("������ ��� ��������");
		String namea = scan.next();

		for (Person per : map.keySet()) {
			if (per.getName().equals(nameu)) {
				Iterator<Animal> iter = per.animal.iterator();
				while (iter.hasNext()) {
					if (iter.next().getNameAnimal().equals(namea)) {
						iter.remove();
						System.out.println("�������� ��������!");
					}
				}
			} else {
				System.out.println("�������� �� ��������");
			}
		}

	}

	public void dellPersonClub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ��� �������� �����");
		String s = scan.next();
		Iterator<Person> iter1 = map.keySet().iterator();
		while (iter1.hasNext()) {
			if (iter1.next().getName().equals(s)) {
				iter1.remove();
				System.out.println("�������� ��������");
			} else {
				System.out.println("������ �������� �� ����");
			}
		}
	}
	public void dellAnimal(){
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ��� �������");
		String s = scan.next();
		
		for (Person per : map.keySet()) {
			Iterator<Animal> iter = per.animal.iterator();
				while (iter.hasNext()) {
					if (iter.next().getNameAnimal().equals(s)) {
						iter.remove();
						System.out.println("�������� ��������!");
					}
				}
			}
	}
}
