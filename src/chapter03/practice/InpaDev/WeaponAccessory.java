package chapter03.practice.InpaDev;

public abstract class WeaponAccessory implements Weapon {

    private Weapon weapon;

    public WeaponAccessory(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void aim_and_fire() {
        weapon.aim_and_fire();
    }
}
