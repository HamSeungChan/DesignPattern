package chapter03.solve1;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "최고급 DarkRoast";
    }

    /*
    *  cost를 오버라이드 해서 DarkRoast 음료 가격과
    *  super.cost() 를 통해 얻은 첨가물 가격을 가져와 return
    * */

    @Override
    public int cost() {
        return 100 + super.cost();
    }
}
