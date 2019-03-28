import java.util.Scanner;
import java.util.InputMismatchException;

public class RaneKalyaniA4
{
    static int credits;
    static int credit_fee;
    static char dept;
    static int dept_fee;
    static char state;
    static double  state_fee;
    static String name;
    static String student_id;   //  Student id is string because SCU Student id starts with 'W'.

    public static void main(String [] args)
    {

        Scanner sc = new Scanner(System.in);
        do                    // do while loop to prompt user to enter student name.
        {
            System.out.println("Welcome!\nPlease fill the details to get an estimate of your tuition.\nEnter your name");  // Take name as input from user.
            name = sc.nextLine();     // Store the name in variable
        }while(name.length() == 0);


        do                 // do while loop to prompt user to enter student id.
        {
            System.out.println("Enter your Student ID");       // Take student id from user.
            student_id = sc.nextLine();       // Store the student id in variable.
        }while(student_id.length() == 0);


        do    // do while loop to continuously prompt user to enter the correct value until the correct value is given.
        {
            System.out.println("Enter Instate(I) or Outstate (O)");
            state = Character.toUpperCase( sc.next().charAt(0));  // Convert to upper case to accept lower as well as upper case inputs.
            if(state == 'I')
            {
                state_fee = 0;      // For instate students state fee is 0
            }

            else if(state == 'O')
            {
                state_fee = 0.2;    // For outstate students state fee will be additional 20% which is 0.2 times.
            }

        }while(state != 'I' && state != 'O');


        do   // do while loop to continuously prompt user to enter the correct value until the correct value is given.
        {
            System.out.println("Enter CS Major (C) or Other Science Major (O) or Other Major (M)");  // Convert to upper case to accept lower as well as upper case inputs.
            dept = Character.toUpperCase(sc.next().charAt(0));   // Convert to upper case to accept lower as well as upper case inputs.
            if(dept == 'C' )
            {
                dept_fee = 250;      // For CS department fees is 250
            }
            else if(dept == 'O')
            {
                dept_fee = 150;     // For Other Science department fees is 150
            }
            else if( dept == 'M')
            {
                dept_fee = 0;       // For Other department fees is 0
            }
        }while(dept != 'C' && dept != 'O' && dept != 'M');


        boolean success = false;
        while(!success)              // Continue this loop until the value of success is not true.
        {
            try                      // Exception handling to make sure user enters only numbers for credits as input.
            {
                System.out.println("Enter Credits");   // Take number of credits from the user
                credits =  sc.nextInt();               // Store the credits in variable
                success = true;                        // Success becomes true if the input given is a number
            }
            catch(InputMismatchException e)            // If the input is not a number it will go in this block
            {
                sc.next();
                System.out.println("\nEnter a number"); // Prompt user to enter a number.
            }
        }

        if(credits <= 12)
        {
            credit_fee = credits * 1200;        // Credit fee is calculated here according to the condition provided
        }
        else
        {
            credit_fee = credits * 1000;        // Credit fee is calculated here according to the condition provided
        }


        calculator fee = new calculator(state_fee, dept_fee, credit_fee);   // Create an object of class calculator
        double tf = fee.tuition_calculator();                 // Call the tuition_calculator method from calculator class using the 'fee' object created.
        System.out.println("Tuition: "+tf);
        System.out.println("Program Completed.");
    }
}


