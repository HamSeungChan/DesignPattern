package chapter02.problem;

/*
*
* 상황 WeatherData에 x,y,z 값이 바뀌면 Display를 변경해야 한다.
* */

public class WeatherData {

    private int x;
    private int y;
    private int z;

    private Display1 display1;
    private Display2 display2;
    private Display3 display3;

    public WeatherData(Display1 display1, Display2 display2, Display3 display3) {
        this.display1 = display1;
        this.display2 = display2;
        this.display3 = display3;
    }


    public void measurementsChange() {

        int x = getX();
        int y = getY();
        int z = getZ();

        // 문제 1. 구체적인 구현에 맞춰서 코딩
        // -> 프로그램을 수정하지 않고서는 새로운 디스플레이 추가 제거 불가능
        // -> 실행 중 추가 제거 불가능

        // 문제 2. 공통된 인터페이스를 사용
        display1.update(x, y, z);
        display2.update(x, y, z);
        display3.update(x, y, z);

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
