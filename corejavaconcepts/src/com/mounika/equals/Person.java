package com.mounika.equals;

public class Person {
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

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Person p1 = new Person("mounika", 10);
		Person p2 = new Person("mounika", 10);
		System.out.println("p1: " + p1.getName() + " " + p1.getAge() + "\n" + "p2: " + p1.getName() + " " + p1.getAge());
		System.out.println("using equals():" + p1.equals(p2));
		System.out.println("using == : " + (p1 == p2));
	}

}
