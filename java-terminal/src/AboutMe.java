public class AboutMe {
    public static void main(String[] args) {
        // the args initialize with 0
        String name = args[0];
        String lastName = args[1];
        int age = Integer.valueOf(args[2]); // Wrappers
        double height = Double.valueOf(args[3]);

        System.out.println("Hello, my name is " + name + " " + lastName);
        System.out.println("I am " + age + " years old");
        System.out.println("My height is " + height + "cm");
    }
}