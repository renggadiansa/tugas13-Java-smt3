package media;

public class Ballpoint implements LaserPointer, StorageMedia {
    public void draw() {
        System.out.println("Drawing with ballpoint...");
    }

    @Override
    public void pointLaser() {
        System.out.println("Pointing laser with ballpoint...");
    }

    @Override
    public void storeData() {
        System.out.println("Storing data in ballpoint...");
    }
}
