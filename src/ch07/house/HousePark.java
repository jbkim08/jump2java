package ch07.house;

public class HousePark {
    /* protected 는 같은 패키지 + 이클래스를 상속받은 클래스 */
    protected String lastname = "park";
    public static void main(String[] args) {
        //같은 패키지의 클래스는 import 안함(자동)
        HouseKim kim = new HouseKim();
        System.out.println(kim.lastname);
    }
}
