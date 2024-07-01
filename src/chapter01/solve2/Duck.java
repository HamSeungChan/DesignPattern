package chapter01.solve2;

/*
* 상황
* Duck 클래스에 fly() 메소드를 추가한다
*
* 해결  1 - 인터페이스를 활용해서 필요한 곳에서만 구현을 한다.
* 문제점 - 코드를 재사용하지 않는 문제점
* */

public class Duck {

    public void swim(){
        System.out.println("헤엄");
    }

    public void display(){
        System.out.println("Duck의 생김새");
    }

//    Duck 클래스에서 fly() 메소드 제거
//    public void fly(){
//        System.out.println("하늘을 나는 중!!");
//    }

    // 기타 오리 관련 메소드

}
