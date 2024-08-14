public class VariableTypes {
    public static void main(String[] args) throws Exception {

        // study reminder
        // primitive types
        // String class as text representation in the application

        String myName = "Gabs";

        double minimumSalary = 2500;

        short shortNumber = 1;

        int normalNumber = shortNumber;

        short shortNumber2 = (short) normalNumber;

        System.out.println("short number: " + shortNumber2);

        System.out.println("==========================================================");

        int number = 5;

        System.out.println("Example int number: " + number);

        System.out.println("==========================================================");

        number = 10;

        System.out.println("Name: " + myName + "\nMinimun salary: " + minimumSalary);

        System.out.println("==========================================================");

        System.out.println("After changing the variable int number: " + number);

        System.out.println("==========================================================");

        // variable name in uppercase to determine that the value does not change
        final double VALUE_PI = 3.14;

        System.out.println("final double variable, value PI: " + VALUE_PI);

    }
}
