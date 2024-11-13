package media;

public class Gun implements LaserPointer {
    @Override
    public void pointLaser() {
        System.out.println("Pointing laser with the gun...");
    }
}
