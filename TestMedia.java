import media.*;

public class TestMedia {
    public static void main(String[] args) {
        Ballpoint ballpoint = new Ballpoint();
        Gun gun = new Gun();
        UsbFlash usbFlash = new UsbFlash();

        System.out.println("Ballpoint functions:");
        ballpoint.draw();
        ballpoint.pointLaser();
        ballpoint.storeData();

        System.out.println("\nGun functions:");
        gun.pointLaser();

        System.out.println("\nUSB Flash functions:");
        usbFlash.storeData();
    }
}
