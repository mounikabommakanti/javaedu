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
		if (this == obj) {
			System.out.println("this"+this+"obj:"+obj );
			return true;}
			
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
		{
			return false;}
		if (name == null) {
			System.out.println(name);
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
		{
			System.out.println("name:"+name +"other.name:"+other.name);
			return false;
		}
			
		return true;
	}


	public static void main(String[] args) {
		Person p1=new Person("mounika",10);
		Person p2=new Person("mounika",10);
		String name="mounika";
		System.out.println(p1.getName().equals(name));//equals() method of object class overridden in String class is invoked
		System.out.println(p1.equals(p2));//equals() of object class which is overridden in Person class is invoked
		
	}

}
