package s03_자바의기초;

public class 상수집합 {
    enum CoffeeType {
        AMERICANO, ICE_AMERICANO, CAFE_LATTE
    }
    public static void main(String[] args) {
        System.out.println(CoffeeType.AMERICANO);
        System.out.println(CoffeeType.ICE_AMERICANO);
        System.out.println(CoffeeType.CAFE_LATTE);
        //반복문
        for (CoffeeType type : CoffeeType.values()){
            System.out.println(type);
        }
    }
}
