package chapter02.solve1;

public class Display3 implements Observer, Display {

    private int x;
    private int y;

    @Override
    public void display() {
        System.out.println("display 1입니당!");
    }

    @Override
    public void update(int x, int y, int z) {
        this.x = x;
        this.y = y;
    }
}
