import weapons.*;

public class TestAbstract {
    public static void main(String args[]) {
        Weapon weapon = new Knife("Pistol");

        Weapon knife = new Knife("Samurai");
        Weapon gun = new Gun(10);

        knife.attack();
        knife.info();
        gun.attack();
        gun.info();
        gun.attack();
        gun.info();

        Knife knife2 = new Knife("Katana");
        Weapon gun2 = new Gun(10);

        knife2.attack();
        knife.info();

        gun2.attack();
        gun.info();
        gun2.attack();

    }
}
