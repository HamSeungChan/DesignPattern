package chapter07.facade;

public class Projector {

    String simpleName = getClass().getSimpleName();

    public void method1() {
        System.out.println(simpleName + "실행 1");
    }

    public void method2() {
        System.out.println(simpleName + "실행 2");
    }

    public void method3() {
        System.out.println(simpleName + "실행 3");
    }

}
