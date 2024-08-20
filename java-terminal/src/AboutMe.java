import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // creating object scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your name");
        String name = scanner.next();

        System.out.println("Enter your last name");
        String lastName = scanner.next();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Enter your height");
        double height = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuario
        System.out.println("Hello, I'm " + name + " " + lastName);
        System.out.println("I'm " + age + " years old ");
        System.out.println("My height is " + height + "cm ");

    }
}
