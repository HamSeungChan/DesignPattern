package chapter04.solve2.chicago;

import chapter04.solve2.Pizza;

public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {

        name = "시카고 스타일 딥 디쉬 치즈 피자";
        dough = "아주 두꺼운 크러스트 도우";
        sauce = "플럼토마토 소스";

        toppings.add("잘게 썬 레지아노 치즈");
    }

    public void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}
