import java.util.Scanner;

public class JL_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value on N: ");
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //   * * * *
        //   * * *
        //   * *
        //   *

    }
}
