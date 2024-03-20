package ch03_10;

public class 상수집합 {

    enum CoffeeType {
        아메리카노,
        아이스아메리카노,
        까페라떼
    }
    public static void main(String[] args) {
        System.out.println(CoffeeType.아메리카노);
        System.out.println(CoffeeType.아이스아메리카노);
        System.out.println(CoffeeType.까페라떼);
    }
}
