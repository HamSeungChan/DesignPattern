package chapter03.solve1;

public class Beverage {

    /*
     * 각 첨가물에 해당하는 불리언 변수를 새로 생성
     * */

    String description;
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;

    public String getDescription() {
        return description;
    }

    /*
    * cost 메소드를 구현한다.
    * 음료(Beverage) 인스터스마다 첨가물에 해당하는 비용을 구한다.
    * 서브 클래스는 cost() 메소드를 오버라이드
    * 거기에 슈퍼클래스 버전을 호출해서 합친 가격을 return 한다.
    * */
    public int cost() {

        int cost = 0;

        if(isMilk()){
            cost += 100;
        }

        // 다른 첨가물 코드들

        return cost;
    }

    public boolean isMilk() {
        return milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
