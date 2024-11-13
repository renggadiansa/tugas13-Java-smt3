package weapons;

public class Gun extends Weapon {
    private int bullets;

    public Gun(int bullets) {
        this.bullets = bullets;
    }

    @Override
    public void attack() {
        if (bullets > 0) {
            bullets--;
            System.out.println("Menembakkan peluru");
            System.out.println("Sisa peluru: " + bullets);
        } else {
            System.out.println("Tidak ada peluru tersisa.");
        }
    }

    @Override
    public void info() {
        super.info();
    }
}
