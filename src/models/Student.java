package models;

import java.util.Scanner;

public class Student {
	private String mId;
	private String mName;
	private int mAge;
	private String mCourse;
	private String mAddress;
	private float mMediumScore;
	
	public Student() {}

	public Student(String mId, String mName, int mAge, String mCourse, String mAddress, float mMediumScore) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.mAge = mAge;
		this.mCourse = mCourse;
		this.mAddress = mAddress;
		this.mMediumScore = mMediumScore;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public int getmAge() {
		return mAge;
	}

	public void setmAge(int mAge) {
		this.mAge = mAge;
	}

	public String getmCourse() {
		return mCourse;
	}

	public void setmCourse(String mCourse) {
		this.mCourse = mCourse;
	}

	public String getmAddress() {
		return mAddress;
	}

	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public float getmMediumScore() {
		return mMediumScore;
	}

	public void setmMediumScore(float mMediumScore) {
		this.mMediumScore = mMediumScore;
	}
	
	/**
	 * input a student 
	 * 
	 * @param scanner
	 */
	public void input(Scanner scanner) {
		System.out.print("Student id: ");
		this.mId = scanner.next();
		
		System.out.print("Student name: ");
		this.mName = scanner.next();
		
		System.out.print("Student age: ");
		this.mAge = scanner.nextInt();
		
		System.out.print("Student course: ");
		this.mCourse = scanner.next();
		
		scanner.nextLine();
		
		System.out.print("Student address: ");
		this.mAddress = scanner.nextLine();
		
		System.out.print("Student medium score: ");
		this.mMediumScore = scanner.nextFloat();
	}
	
	/**
	 * input of a student 
	 * 
	 * @param scanner
	 * @param st
	 * @return
	 */
	public Student input(Scanner scanner , Student st) {
		System.out.print("Student id: ");
		st.mId = scanner.next();
		
		System.out.print("Student name: ");
		st.mName = scanner.next();
		
		System.out.print("Student age: ");
		st.mAge = scanner.nextInt();
		
		System.out.print("Student course: ");
		st.mCourse = scanner.next();
		
		scanner.nextLine();
		System.out.print("Student address: ");
		st.mAddress = scanner.nextLine();
		
		System.out.print("Student medium score: ");
		st.mMediumScore = scanner.nextFloat();
		
		return st;
	}
	
	/**
	 * show 
	 */
	public void show() {
		System.out.println("----- INFORMATION OF A STUDENT --------");
		System.out.println("ID: " + this.mId);
		System.out.println("NAME: " + this.mName);
		System.out.println("AGE: " + this.mAge);
		System.out.println("COURSE: " + this.mCourse);
		System.out.println("ADDRESS: " + this.mAddress);
		System.out.println("MEDIUM SCORE: " + this.mMediumScore);
	}
	
	/**
	 * show from a param student 
	 */
	public void show(Student st) {
		System.out.println("----- INFORMATION OF A STUDENT --------");
		System.out.println("ID: " + st.mId);
		System.out.println("NAME: " + st.mName);
		System.out.println("AGE: " + st.mAge);
		System.out.println("COURSE: " + st.mCourse);
		System.out.println("ADDRESS: " + st.mAddress);
		System.out.println("MEDIUM SCORE: " + st.mMediumScore);
	}
	
}
