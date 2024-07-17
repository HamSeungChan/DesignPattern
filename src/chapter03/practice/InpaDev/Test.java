package chapter03.practice.InpaDev;

public class Test {
    public static void main(String[] args) {

        // 유탄이 달린 총
        Weapon generade_gun = new Generade(new BaseWeapon());
        generade_gun.aim_and_fire();

        // 스코프가 달린 총
        Weapon scoped_gun = new Scoped(new BaseWeapon());
        scoped_gun.aim_and_fire();

        // 유탄을 달고 스코프가 달린 총
        Weapon generade_scoped_gun = new Generade(new Scoped(new BaseWeapon()));
        generade_scoped_gun.aim_and_fire();

    }
}
