import java.util.Scanner;

public class PracticeArrays {
    public static Scanner keyboard = new Scanner(System.in);
    static int grades[] = new int[5];
    static String students[] = new String[grades.length];

    public static void main(String[] args) {
        practice1();
        practice2();
    }


    public static void practice1() {

        for (int i = 0; i < grades.length; i++) {
            System.out.println("What is the grade for student# " + (i + 1) + ": ");
            // reason for (i + 1) so it looks nice and starts with student 1 instead of student 0
            grades[i] = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("What is the name of student# " + (i + 1) + ": ");
            students[i] = keyboard.nextLine();
        }

        for (int i = 0; i < grades.length; i++) {
            //System.out.println("student# " + (i + 1) + ": " + grades[i]);
            System.out.println(students[i] + ": " + grades[i]);
        }
        System.out.println("**************************");

        //enhanced loop, its read only
        for (int val : grades) {
            System.out.println(val);
        }
    }

    public static void practice2() {

        //average
        double totalAverage = 0;
        for (int val : grades) {
            totalAverage = totalAverage + val;
        }
        totalAverage = totalAverage / grades.length;
        System.out.println("The average score is " + totalAverage);



        //highest grade
        //int highestScore = 0;
        int highestScore = grades[0];
        //String highestStudent = "";
        String highestStudent = students[0];
        //for(int val: grades) {

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > highestScore) {
                highestScore = grades[i];
                highestStudent = students[i];
            }
        }
        System.out.println("The student with the highest score is " + highestStudent);


        //lowest

        //int lowestScore = 1000;
        //String lowestStudent = "";
        int lowestScore = grades[0];
        String lowestStudent = students[0];
        //for(int val: grades) {

        for (int j = 0; j < grades.length; j++) {
            if (grades[j] < lowestScore) {
                lowestScore = grades[j];
                lowestStudent = students[j];
            }
        }
        System.out.println("The student with the lowest score is " + lowestStudent);


        //amount above average
        int peopleAboveAverage = 0;
        for (int p = 0; p < grades.length; p++){
            if (grades[p] > totalAverage){
                peopleAboveAverage++;

            }
        }
        System.out.println("The amount of students with above average score is " + peopleAboveAverage);
    }
}

