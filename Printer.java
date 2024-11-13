interface Scanner {
    void scanImage();
}

interface Copier {
    void copyImage();
}

public class Printer implements Copier, Scanner {
    @Override
    public void scanImage() {
        System.out.println("Scanning image...");
    }

    @Override
    public void copyImage() {
        System.out.println("Copying image...");
    }

    public void printImage() {
        System.out.println("Printing image...");
    }
}
