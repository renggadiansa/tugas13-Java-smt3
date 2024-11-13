import devices.Lens;
import devices.SmartPhone;

public class TestDevices {
    public static void main(String[] args) {
        Lens lens = new Lens();
        SmartPhone smartphone = new SmartPhone(lens);

        smartphone.setPhoneNumber("123-456-7890");

        smartphone.call();
        smartphone.receiveCall();
        smartphone.captureImage();
        smartphone.readCard();
    }
}
