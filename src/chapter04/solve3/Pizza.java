package chapter04.solve3;

import chapter04.solve3.ingredient.*;

public abstract class Pizza {

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    // 추상 메소드로 변경
    // 피자를 만드는 데 필요한 재료들을 가져온다.
    abstract void prepare();

    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }


    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }


    public void box() {
        System.out.println("상자에 피자 담기");
    }
}
