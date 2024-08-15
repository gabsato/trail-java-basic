public class Operators {

    public static void main(String[] args) {

        String nameOne = "Mahou";
        String nameTwo = new String("Mahou");

        System.out.println(nameOne.equals(nameTwo));

        int number1 = 1;
        int number2 = 2;

        boolean yesNo = number1 == number2;

        if (number1 == number2) {
            System.out.println("The condition is true");
        }

        System.out.println("The number1 equals number2 " + yesNo);

        yesNo = number1 != number2;

        System.out.println("The number1 different number2 " + yesNo);

        yesNo = number1 > number2;

        System.out.println("The number1 is greater than number2 " + yesNo);
    }
}