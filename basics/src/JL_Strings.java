import java.util.Locale;
import java.util.Scanner;

public class JL_Strings {
    public static void main(String[] args) {
        String s = "MaNiSHA";
        System.out.println(s.toLowerCase(Locale.ROOT));

        s = "New String for question two";
        System.out.println(s.replace(" ", "_"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.next();
        String template = "Dear " + name + ", Thanks a lot.";
        System.out.println(template);


        s = "Demo      String   To Detect    double and    triple spaces..";
        System.out.println(s.indexOf("  "));
        System.out.println(s.indexOf("   "));


        String letter = "Dear Manisha, This java Course is nice. Thanks";
        String formattedLetter = "Dear Manisha,\nThis java Course is nice.\n\tThanks";

        System.out.println(formattedLetter);

    }
}
