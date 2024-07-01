package chapter01.solve3.fly;

import chapter01.solve2.Flyable;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날개를 같고 하늘을 날아요 !! ");
    }
}
