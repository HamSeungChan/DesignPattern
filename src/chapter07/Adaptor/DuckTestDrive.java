package chapter07.Adaptor;

public class DuckTestDrive {

    public static void main(String[] args) {

        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("칠면조가 말하길");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n오리가 말하길");
        testDuck(duck);

        System.out.println("\n칠면조 어댑터가 말하길");
        testDuck(turkeyAdapter);
    }

    // 클라이언트에서는 Duck, Turkey 중 어는 것이 작동하는지 모른다!!
    // 클라이언트는 중간에 Adapter 가 존재하는지 모른다.
    // 의존성이 줄어들고 역할 분리가 가능하다.
    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
