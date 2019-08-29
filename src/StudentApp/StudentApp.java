/*
STUDENT NO: 26122197

Write a Java program (in an object-oriented way), that prompts for a student 
last name, first name and a grade that they scored in a test and thereafter 
prints out the student last name, first name, grade as well as a classification
of the grade. Grades are classified as follows: A: 90 –100, B: 80 –89,
C: 70 –79, D: 60 –69, E: 50 –59 and F: 0 –49. The program should also verify
that grades entered range from 0 to 100. Invalid grades such as 200, -100, 
1000, etcshould be rejected and the program should prompt re-entering of 
student details.
*/
package StudentApp;

import java.util.Scanner;


public class StudentApp{

    private String firstName;
    private  String lastName;
    private int grade;
        
    public StudentApp()
    {
        String firstName = " ";
        String lastName  = " ";
        int grade = 0;
        
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setGrade(int grade)
    {
     this.grade = grade; 
    }
  
    public String getfirstName()
    {
        return firstName;

    }
    public String getLastName()
    {
        return lastName;
    }
    public int getGrade()
    {
        return grade;
    }
    public void printDetails()
    {
        System.out.println("Hey " + firstName + " " + lastName + " \nThank you"
                + " for entering your Score. ");
    }
    public char gradeChoices()
    {       
     
                switch (grade / 10) 
                { 
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                        return 'F';
                      
                case 5:
                        return 'E';
                       
                case 6: 
                        return 'D';
                       
                case 7: 
                        return 'C';
                case 8: 
                        return 'B';
                case 9: 
                case 10: 
                       return 'A';
               // default: 
               //         System.out.println("Invalid test score.");
                        
                }
    
    }
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
      String firstname1;
      String lastName1;
      int grade1;
      
      
      System.out.println("Enter your first name: ");
      firstname1 = input.next();
      System.out.println("Enter your last name: ");
      lastName1 = input.next();
      System.out.println("Enter the marks you have scored: ");
      grade1 = input.nextInt();
      
      //declaring mygrade as an object for class GradeApp
      StudentApp grades = new StudentApp();
      grades.setFirstName(firstname1);
      grades.setLastName(lastName1);
      grades.setGrade(grade1);
      
      grades.printDetails();
      grades.gradeChoices();
      
    }
    
}
