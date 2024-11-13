package weapons;

public class Knife extends Weapon {
    private String knifeEdge;

    public Knife(String knifeEdge) {
        this.knifeEdge = knifeEdge;
    }

    @Override
    public void attack() {
        System.out.println("Menyayat dan menusuk musuh");
    }

    @Override
    public void info() {
        super.info();
    }
}
