public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Is the TV on? " + smartTv.isOn);
        System.out.println("Which current channel? " + smartTv.channel);
        System.out.println("What is the current volume? " + smartTv.volume);

        System.out.println("=======================");

        smartTv.turnOn();
        System.out.println("New status -> Is the TV on? " + smartTv.isOn);

        // smartTv.turnOff();
        // System.out.println("New status -> Is the TV on? " + smartTv.isOn);

        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.increaseVolume();

        System.out.println("New status -> What is the current volume? " + smartTv.volume);

        smartTv.changeChannel(13);
        System.out.println("New stauts -> Which current channel? " + smartTv.channel);
    }
}
