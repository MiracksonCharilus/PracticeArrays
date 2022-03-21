import java.util.Scanner;

public class PracticeArrayObject {
        public static Scanner keyboard = new Scanner(System.in);
        static Student[] myStudents = new Student[3];

        public static void main(String[] args) {
            practice1();
            practice2();
        }


        public static void practice1() {
            int grade;
            String name;

            for (int i = 0; i < myStudents.length; i++) {
                System.out.println("What is the grade for student# " + (i + 1) + ": ");
                // reason for (i + 1) so it looks nice and starts with student 1 instead of student 0
                grade = keyboard.nextInt();
                keyboard.nextLine();
                System.out.println("What is the name of student# " + (i + 1) + ": ");
                name = keyboard.nextLine();
                Student aStudent = new Student(name, grade);
                myStudents[i] = aStudent;
            }

            for (int i = 0; i < myStudents.length; i++) {
                //System.out.println("student# " + (i + 1) + ": " + grades[i]);
                System.out.println(myStudents[i]);
            }
            System.out.println("**************************");

            //enhanced loop, its read only
            for (Student val : myStudents) {
                System.out.println(val);
            }
        }

        public static void practice2() {

            //average
            double totalAverage = 0;
            for (Student val : myStudents) {
                totalAverage = totalAverage + val.getGrade();
            }
            totalAverage = totalAverage / myStudents.length;
            System.out.println("The average score is " + totalAverage);



            //highest grade
            //int highestScore = 0;
            int highestScore = myStudents[0].getGrade();
            //String highestStudent = "";
            String highestStudent =  myStudents[0].getName();
            //for(int val: grades) {

            for (int i = 0; i < myStudents.length; i++) {
                if (myStudents[i].getGrade() > highestScore) {
                    highestScore =  myStudents[i].getGrade();
                    highestStudent =  myStudents[i].getName();
                }
            }
            System.out.println("The student with the highest score is " + highestStudent);


            //lowest

            //int lowestScore = 1000;
            //String lowestStudent = "";
            int lowestScore =  myStudents[0].getGrade();
            String lowestStudent =  myStudents[0].getName();
            //for(int val: grades) {

            for (int j = 0; j < myStudents.length; j++) {
                if ( myStudents[j].getGrade() < lowestScore) {
                    lowestScore = myStudents[j].getGrade();
                    lowestStudent =  myStudents[j].getName();
                }
            }
            System.out.println("The student with the lowest score is " + lowestStudent);


            //amount above average
            int peopleAboveAverage = 0;
            for (int p = 0; p < myStudents.length; p++){
                if ( myStudents[p].getGrade() > totalAverage){
                    peopleAboveAverage++;

                }
            }
            System.out.println("The amount of students with above average score is " + peopleAboveAverage);
        }
    }



