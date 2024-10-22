package chapter05;

// 멀티스레드 환경에서 문제

public class Problem2 {

    private static Problem2 problem;

    private Problem2() {
    }

    public static Problem2 getInstance() {

        // 동시성 문제가 발생하는 경우
        // if 문과 problem에 인스턴스를 생성하는 과정에 동시에 객체가 생성될 수 있음
        if (problem == null) {
            problem = new Problem2();
        }
        // 동시성 문제가 발생하는 경우

        return problem;
    }
}
