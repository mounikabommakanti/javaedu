package com.mounika.collections;

import java.util.HashMap;

public class HashMapDemo extends Student {
	public static HashMap<Integer, Student> buildMap(Student[] students) {
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		
		for (Student s : students) {
			//System.out.println(s.getIdn()+s.getName());
			map.put(s.getIdn(), s);
		}
		return map;
	}

	public static void main(String args[]) {
		int id;
		Student[] students = new Student[3];
		HashMap<Integer, Student> hm = new HashMap<Integer, Student>();
		for (int i = 0; i < 3; i++) {
			students[i] = new Student();
			students[i].setIdn(i);
			students[i].setName("student"+i);
			
			
		}
		hm = buildMap(students);
		for(int i=0;i<3;i++) {
		System.out.println(hm.get(i).getIdn());
		System.out.println(hm.get(i).getName());
		}
	}
}
