package common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import models.Student;

public class StudentUtils {
	
	public static List<Student> mDataStudent = new ArrayList<>();
	
	/**
	 * Constructor def
	 */
	public StudentUtils() {}
	
	
	/**
	 * show menu 
	 * 
	 * @param sc
	 */
	public void initMenu(Scanner sc) {
		System.out.println("OPTIONAL");
		System.out.println("\t\t=== Manager Student ===");
		System.out.println("1.Input student");
		System.out.println("2.Show all list student");
		System.out.println("3.Displays the average score of the gradual list of students");
		System.out.println("4.Search course of all student");
		System.out.println("5.Search and show id of a student");
		System.out.println("6.Exit");
	}
	
	/**
	 * add student 
	 * 
	 * @param sc
	 */
	public void add(Scanner sc) {
		Student student = new Student();
		student.input(sc);
		mDataStudent.add(student);
	}

	
	public void showListStudent() {
		for (int i = 0; i < mDataStudent.size(); i++) {
			System.out.println("=== Information Student " + (i + 1) + " ===");
			mDataStudent.get(i).show();
		}
	}

	/**
	 * sort 
	 */
	public void sort() { // sap xep tang dan
		Collections.sort(mDataStudent, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getmMediumScore() > o2.getmMediumScore())
					return 1;
				else if (o1.getmMediumScore() < o2.getmMediumScore())
					return -1;
				else
					return 0;
			}
		});
		System.out.println("Complete...!!!");
	}

	/**
	 * search course 
	 */
	public void searchCourse(Scanner scanner) { // tim kiem sinh vien theo khoa hoc
	
		int count = 0;
		System.out.print("PLEASE INPUT THE COURSE : ");
		String course = scanner.nextLine();
		for (Student student : mDataStudent) {
			if (student.getmCourse().equalsIgnoreCase(course)) {
				count++;
				student.show();
				System.out.println("===========");
			}
		}
		if (count == 0)
			System.out.println("not found!!");
	}

	/**
	 * search ID 
	 */
	public void searchId(Scanner scanner) { // tim kiem sinh vien theo ID
		int count = 0;
		System.out.print("PLEASE INPUT A ID: ");
		String id = scanner.nextLine();
		for (Student student : mDataStudent) {
			if (student.getmId().equals(id)) {
				count++;
				student.show();
			}
		}
		if (count == 0)
			System.out.println("not found!!");
	}


}
