package studyTool;

import java.util.Scanner;

public class StudyPage {
	public static void main(String[] args) {
		
		Scanner scanterm = new Scanner(System.in);
		String termvar;
		System.out.println("Enter a study term");
		termvar = scanterm.nextLine();
		Scanner scandef = new Scanner(System.in);
		String termdef;
		System.out.println("Enter a definition");
		termdef = scandef.nextLine();
		
		System.out.println(termvar + ": " + termdef);
		scanterm.close();
		scandef.close();
	}
}
