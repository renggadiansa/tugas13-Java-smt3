package devices;

public class SmartPhone extends Phone implements Camera, CardReader {
    private Lens lens;

    public SmartPhone(Lens lens) {
        this.lens = lens;
    }

    @Override
    public void captureImage() {
        System.out.println("Tangkapan layar dengan " + lens);
    }

    @Override
    public void readCard() {
        System.out.println("Membaca kartu...");
    }
}
