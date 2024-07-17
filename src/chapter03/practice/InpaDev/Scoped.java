package chapter03.practice.InpaDev;

public class Scoped extends WeaponAccessory {

    public Scoped(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void aim_and_fire() {
        aiming();
        super.aim_and_fire();
    }

    public void aiming() {
        System.out.println("조준 중...");
    }
}
