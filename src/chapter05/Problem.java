package chapter05;

public class Problem {

    /*
     * 객체 인스턴스가 하나만 필요한 이유
     * 1. 제어와 인스턴스 풀 관리 처럼 많은 인스턴스가 필요하지 않는 경우 -> 2개 이상의 인스턴스를 사용해 자원 낭비
     * 2. 일관성을 유지해야 하는 경우
     * ex) 로그 기록용 객체, 캐시, 레지스트리 설정
     *
     * 싱글톤 패턴과 전역 변수와의 차이점은??
     * static 으로 선언하게 되면 어플리케이션 시작 단계에 인스턴스가 생성됨
     * 사용하지 않는데 메모리가 까지 많이 차지하게 된다면 결국 자원 낭비임
     * 싱글톤 패턴은 lazy 생성이 가능해서 처음 Instance 를 요청할 때 생성되어, 필요할 때만 사용이 가능하다/
     * */

    private static Problem problem;

    // 생성자를 private로 접근을 선택하면 외부에서 인스턴스를 생성할 수 없다.
    private Problem() {
    }

    public static Problem getInstance() {
        if (problem == null) {
            problem = new Problem();
        }
        return problem;
    }

}




