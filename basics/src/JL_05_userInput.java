import java.util.Scanner;

public class JL_05_userInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
//        int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter Number 2: ");
//        int b = sc.nextInt();
        float b = sc.nextFloat();
//        int sum = a+b;
        float sum = a+b;
        System.out.print("The Sum of these numebrs is: ");
        System.out.println(sum);


//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);

        String str= sc.next();
        String str1= sc.nextLine();
        System.out.println(str);
    }
}