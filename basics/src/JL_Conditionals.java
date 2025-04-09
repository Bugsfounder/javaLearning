import java.util.Scanner;

public class JL_Conditionals {
    public static void main(String[] args) {

//        int a = 10;
//        if (a = 11) { // error because of assignment operator instead of comparison operator
//            System.out.println("i am 11");
//        } else {
//            System.out.println("i am not 11");
//        }


        // QUESTION 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Subject 1: ");
        byte marks1 = sc.nextByte();
        System.out.println("Enter Marks of Subject 2: ");
        byte marks2 = sc.nextByte();
        System.out.println("Enter Marks of Subject 3: ");
        byte marks3 = sc.nextByte();

        float percentage = (((marks1 + marks2 + marks3) / 300.0f) * 100);

        System.out.println(percentage);

//         QUESTION 3
        System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if (income <= 2.5) {
            tax = tax + 0;
        } else if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income > 5f && income <= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        } else if (income > 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println(tax);

        System.out.println("Enter Number of Day: ");
        int dayNum = sc.nextInt();

        switch (dayNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        String url = sc.next();
        if (url.contains(".com")) {
            System.out.println("Commercial Website");
        } else if (url.contains(".org")) {
            System.out.println("organization website");
        } else if (url.contains(".in")) {
            System.out.println("Indian Website");
        }

    }
}
