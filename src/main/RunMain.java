package main;

import java.util.Scanner;

import common.StudentUtils;

public class RunMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// initialization object
		StudentUtils ui = new StudentUtils();
		int option;
		do {
			ui.initMenu(sc);
			option = sc.nextInt();
			// switch case ste
			switch (option) {
			case 1:
				ui.add(sc);
				break;

			case 2:
				ui.showListStudent();
				break;

			case 3:
				ui.sort();
				break;

			case 4:
				ui.searchCourse(sc);
				break;

			case 5:
				ui.searchId(sc);
				break;

			case 6:
				System.exit(0);
				break;

			default:
				ui.initMenu(sc);
				break;
			}
		} while (option != 6);

	}

}
