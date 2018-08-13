package set07110;

//imports appear here before the class definition but after the package definition

import java.util.Arrays;

public class Grades {

	public static void main(String[] args) {

		int[] studentMarks = { 68, 92, 86, 58, 43, 66, 60, 84, 58, 59, 93, 56, 18, 41, 62, 64, 38, 49, 48, 76, 68, 47,
				70, 41, 51, 54, 58, 64, 57, 37, 51, 69, 42, 47, 96, 43, 32, 60, 58, 73, 83, 70, 55, 27, 32, 31, 72, 59,
				46, 63, 85, 80, 61, 43, 88, 74, 72, 44, 25, 79, 49, 58, 75, 77, 60, 68, 70, 82, 56, 61, 35, 11, 85, 60,
				58, 40, 64, 58, 56, 85, 62, 38, 54, 31, 66, 41, 53, 72, 19, 44, 41, 84, 66, 72, 88, 48, 91, 70, 4, 24 };

		System.out.println(studentMarks.length);

		/**
		 * Add code to calculate
		 * 
		 * a) the mean (average) grade 
		 * b) the median grade (hint middle value or average of middle 2 values)
		 * c) the number of students that got less than 40% 
		 * d) the number of students that got 70% or more
		 * 
		 */

        Grades grades = new Grades();

		// a) the mean grade
        System.out.println("Mean grade: " + grades.CalculateMeanGrade(studentMarks));
        // b) the median grade
        System.out.println("Median grade: " + grades.CalculateMedianGrade(studentMarks));
        // c) less than 40%
        System.out.println("Number of students with less than 40%: " + grades.CalculateLessThan40(studentMarks));
        // d) 70% or more
        System.out.println("Number of students with 70% or greater: " + grades.CalculateGreaterThan70(studentMarks));
	}

	double CalculateMeanGrade(int[] grades) {
        int sumOfGrades = 0;
        double meanGrade;
        for (int i = 0; i < grades.length; ++i) {
            sumOfGrades += grades[i];
        }
        meanGrade = (double)sumOfGrades / grades.length;
        return meanGrade;
    }

    double CalculateMedianGrade(int[] grades) {
        Arrays.sort(grades);
        double medianGrade;
        if (grades.length % 2 == 0) {
            medianGrade = ((double)grades[grades.length/2] + (double)grades[grades.length/2-1]) / 2;
        } else {
            medianGrade = (double)grades[grades.length/2];
        }
	    return medianGrade;
    }
    int CalculateLessThan40(int[] grades) {
	    int lessThan40 = 0;
	    for (int i = 0; i < grades.length; ++i) {
	        if (grades[i] < 40) {
	            lessThan40++;
            }
        }
        return lessThan40;
    }
    int CalculateGreaterThan70(int[] grades) {
	    int moreThan70 = 0;
        for (int i = 0; i < grades.length; ++i) {
            if (grades[i] >= 70) {
                moreThan70++;
            }
        }
        return moreThan70;
    }
}