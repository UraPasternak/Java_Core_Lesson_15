package ua.lviv.lgs.hw15;

import java.util.Scanner;

public class Animal {
	private String typAnimal;
	private String nameAnimal;

	public String getTypAnimal() {
		return typAnimal;
	}

	public void setTypAnimal(String typAnimal) {
		this.typAnimal = typAnimal;
	}

	public String getNameAnimal() {
		return nameAnimal;
	}

	public void setNameAnimal(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}

	public Animal() {
		super();
		Scanner scan = new Scanner(System.in);
		System.out.println("¬вед≥ть тип тварини:");
		typAnimal = scan.next();
		System.out.println("¬вед≥ть ≥м€ тварини:");
		nameAnimal = scan.next();
	}

	@Override
	public String toString() {
		return "Animal [typAnimal=" + typAnimal + ", nameAnimal=" + nameAnimal + "]";
	}
}
