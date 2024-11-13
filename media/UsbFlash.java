package media;

public class UsbFlash implements StorageMedia {
    @Override
    public void storeData() {
        System.out.println("Storing data in USB flash drive...");
    }
}
