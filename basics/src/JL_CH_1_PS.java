import java.util.Scanner;

public class JL_CH_1_PS {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc= new Scanner(System.in);

        // Q. Write a program to sum three numbers.
        // Taking inputs
        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 =sc.nextInt();
        System.out.print("Enter Number 3: ");
        int num3 = sc.nextInt();

        // creating sum variable
        int sum = num1+num2+num3;
        System.out.print("Sum of Three numbers is: ");
        System.out.println(sum);


        // write a program which asks the user to enter his/her name and greets them with "Hello <user>, have a good day" text.
        System.out.println("Enter Your Name: ");
        String name = sc.next();
        String str = "Hello "+ name +", have a good day.";
        System.out.println(str);


        // convert kilometer into miles
        // multiply kilometers by 0.621371
        System.out.print("Enter Kilometers: ");
        int kilometers = sc.nextInt();
        System.out.println(kilometers*0.621371);

        // detect a number entered by user is integer or not
        System.out.println("Enter the Number to detect: ");
        boolean num = sc.hasNextInt();

        System.out.println("Is Int: "+num);


        // calculate CGPA for 3 subjects
        int num1n =32;
        int num2n=43;
        int num3n=89;
        System.out.println((num1n+num2n+num3n)/30);

    }
}
