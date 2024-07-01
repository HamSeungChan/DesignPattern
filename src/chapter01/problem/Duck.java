package chapter01.problem;

/*
* 상황
* Duck 클래스에 fly() 메소드를 추가한다
*
* 해결  1 - 상속
*
* 문제점 1 - 날지 않는 Duck들도 fly() 메소드를 사용 가능
* 해결 - 날지 못하는 Sub Class에서 메소드 오버라이드
* 문제점 2 - 새로운 Sub Class가 추가될 때 마다 메소드 오버라이드 - 유지보수성이 떨어지고 코드 중복이 발생
*
* 결론 - 상속은 좋지 못한 방법이다 !! 규격이 바뀔 때 마다 서브클래스의 메소드를 확인하고 오버라이드 작업이 필요
* */

public class Duck {

    public void quack(){
        System.out.println("꿱");
    }

    public void swim(){
        System.out.println("헤엄");
    }

    public void display(){
        System.out.println("Duck의 생김새");
    }

    public void fly(){
        System.out.println("하늘을 나는 중!!");
    }

    // 기타 오리 관련 메소드

}
