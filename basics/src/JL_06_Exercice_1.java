import java.util.Scanner;

public class JL_06_Exercice_1 {
    public static void main(String[] args) {
//        write a program to calculate percentage of a given student in CBSE board exam, His marks from 5 subjects must be taken as input from the keyboard. (marks are out of 100)


        Scanner sc = new Scanner(System.in);
        System.out.print("Total Marks: ");
        int total = sc.nextInt();

        int max = total*5;


        System.out.println("Enter Marks 1: ");
        float m1 = sc.nextFloat();
        System.out.println("Enter Marks 2: ");
        float m2 = sc.nextFloat();
        System.out.println("Enter Marks 3: ");
        float m3 = sc.nextFloat();
        System.out.println("Enter Marks 4: ");
        float m4 = sc.nextFloat();
        System.out.println("Enter Marks 5: ");
        float m5 = sc.nextFloat();

        float percentage = ((m1+m2+m3+m4+m5)/max)*100;
        System.out.println(percentage);
    }
}
