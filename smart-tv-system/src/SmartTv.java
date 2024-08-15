public class SmartTv {

    boolean isOn = false;
    int channel = 1;
    int volume = 25;

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }

    public void increaseChannel() {
        channel++;
    }

    public void decreaseChannel() {
        channel--;
    }

    public void increaseVolume() {
        // volume = volume + 1;
        volume++;
    }

    public void decreaseVolume() {
        // volume = volume + 1;
        volume--;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }
}