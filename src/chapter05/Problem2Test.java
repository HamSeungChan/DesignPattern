package chapter05;

public class Problem2Test {
    public static void main(String[] args) {


        Runnable a1 = new Runnable();
        Runnable a2 = new Runnable();

        Thread thread1 = new Thread(a1);
        Thread thread2 = new Thread(a2);

        thread1.start();
        thread2.start();

    }

    static class Runnable implements java.lang.Runnable {

        Problem2 problem2;

        @Override
        public void run() {
            problem2 = Problem2.getInstance();
            System.out.println(problem2);
        }

        // 출력
        /*
        * chapter05.Problem2@7442e36b
        * chapter05.Problem2@5d72a224
        * */


    }
}
