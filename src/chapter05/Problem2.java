package chapter05;

// 멀티스레드 환경에서 문제

public class Problem2 {

    // solve1 -> 미리 인스턴스를 생성한다.
    private static Problem2 problem = new Problem2();

    private Problem2() {
    }

    public static Problem2 getInstance() {
        return problem;
    }
}
