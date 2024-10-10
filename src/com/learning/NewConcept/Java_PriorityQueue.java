package com.learning.NewConcept;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
//import com.learning.NewConcept.Java_Sort;

class StudentTest {
	private int id;
	private String name;
	private double cgpa;

	public StudentTest(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "StudentTest [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}

}

class Priorities {

	public List<StudentTest> getStudents(List<String> events) {

		PriorityQueue<StudentTest> pQueue = new PriorityQueue<>(new StudentComperator());
		List<StudentTest> remainingStudents = new ArrayList<>();

		for (String event : events) {

			String[] parts = event.split(" ");
			
			if (parts[0].equals("ENTER")) 
			{
				String name = parts[1];
				double cgpa = Double.parseDouble(parts[2]);
				int id = Integer.parseInt(parts[3]);
				pQueue.add(new StudentTest(id, name, cgpa));
			} 
			else
			{
				pQueue.poll();
			}

		}

		while (!pQueue.isEmpty())
			remainingStudents.add(pQueue.poll());

		return remainingStudents;
	}
}

class StudentComperator implements Comparator<StudentTest> {

	@Override
	public int compare(StudentTest o1, StudentTest o2) {

		int cgpaOutput = Double.compare(o2.getCgpa(), o1.getCgpa());

		if (cgpaOutput == 0) {

			int nameOutput = o1.getName().compareTo(o2.getName());

			if (nameOutput == 0)
				return Integer.compare(o1.getId(), o2.getId());

			return nameOutput;
		}

		return cgpaOutput;
	}

}

public class Java_PriorityQueue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numberOfEvents = sc.nextInt();
		sc.nextLine();
		
		List<String> events = new ArrayList<>();

		for (int i = 0; i < numberOfEvents; i++) {
            events.add(sc.nextLine());
        }
		
		sc.close();

		List<StudentTest> studentList = new Priorities().getStudents(events);

		for (StudentTest obj : studentList) {
			System.out.println(obj.getName());
		}
	}

}
