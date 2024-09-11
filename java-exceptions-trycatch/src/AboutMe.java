import java.util.*;

public class AboutMe {
    public static void main(String[] args) {
        try {
            // criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Enter your name: ");
            String name = scanner.next();

            System.out.println("Enter your last name: ");
            String lastName = scanner.next();

            System.out.println("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println("Enter you height: ");
            double height = scanner.nextDouble();

            // imprimindo os dados obtidos pelo usuario
            System.out.println("Hello, I'm called " + name.toUpperCase() + " " + lastName.toUpperCase());
            System.out.println("I'm " + age + " years old ");
            System.out.println("My height is " + height + "cm ");
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("The age and height fields need to be numeric");
        }
    }
}
