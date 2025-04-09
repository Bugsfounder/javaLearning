import java.util.Scanner;

public class JL_SumOfN_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of N: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
