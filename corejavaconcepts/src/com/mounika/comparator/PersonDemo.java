package com.mounika.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonDemo implements Comparator<PersonDemo>, Comparable<PersonDemo> {
	String name;
	int age;

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

	public PersonDemo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public PersonDemo() {

	}

	@Override
	public int compareTo(PersonDemo p) {
		return this.age - p.getAge();
	}

	public int compare(PersonDemo p1, PersonDemo p2) {
		if (p1.getAge() > p2.getAge())
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		PersonDemo p1 = new PersonDemo("priyanka", 29);
		PersonDemo p2 = new PersonDemo("preethi", 26);
		PersonDemo p3 = new PersonDemo("mounika", 24);
		List<PersonDemo> personlist = new ArrayList<PersonDemo>();
		personlist.add(p1);
		personlist.add(p2);
		personlist.add(p3);
		Comparator<PersonDemo> comparator = new PersonDemo();
		Collections.sort(personlist, comparator);
		System.out.println("Persons after sorting using comparator based on age: ");
		for (PersonDemo person : personlist) {
			System.out.println(person.getName() + " " + person.getAge());
		}
		Collections.sort(personlist);
		System.out.println("Persons after sorting after sorting using comparable based on age: ");
		for (PersonDemo person : personlist) {
			System.out.println(person.getName() + " " + person.getAge());
		}

	}

}
