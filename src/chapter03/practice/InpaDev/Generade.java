package chapter03.practice.InpaDev;

public class Generade extends WeaponAccessory {

    Generade(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void aim_and_fire() {
        super.aim_and_fire();
        generade_fire();
    }

    public void generade_fire() {
        System.out.println("유탄 발사");
    }
}
