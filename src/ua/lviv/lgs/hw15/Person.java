package ua.lviv.lgs.hw15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	List<Animal> animal = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
		super();
		Scanner scan = new Scanner(System.in);
		System.out.println("¬вед≥ть ≥м€:");
		name = scan.next();
		System.out.println("¬вед≥ть в≥к:");
		age = scan.nextInt();

	}

	public List<Animal> getAnimal() {
		return animal;
	}

	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", animal=" + animal + "]";
	}


}
