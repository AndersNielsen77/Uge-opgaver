package uge4;
import java.util.*;

public class opgave41 {

	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	
	System.out.println("Skriv din karakter i 13-skalaen.");
	//int inputgrade = console.nextInt();
	//System.out.println(converted13to7);
        try {
            System.out.println("Din nye karakter: "+convert13to7(console.nextInt()));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        }
    }

	public static int convert13to7(int grade) {
		if (grade > 13 || grade < 0) {
			throw new IllegalArgumentException();

		}	    
		int GradeConverter = -1;
		if (grade == 13 ) {
			GradeConverter = 12;
		} else if (grade == 11) {
			GradeConverter = 12;
		} else if (grade == 10) {
			GradeConverter = 10;
		} else if (grade == 9 || grade == 8) {
			GradeConverter = 7;
		} else if (grade == 7) {
			GradeConverter = 4;
		} else if (grade == 6) {
			GradeConverter = 02;
		} else if (grade == 5 || grade == 03) {
			GradeConverter = 00;
		} else if (grade == 00) {
			GradeConverter = -3;
		}
		System.out.println("Gamle karakter: " + grade);
		return GradeConverter;
	}
}

