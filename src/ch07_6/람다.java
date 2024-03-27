package ch07_6;

interface Calulator {
    int sum(int a, int b); //추상메서드
}
//class MyCalculator implements Calulator {
//
//    @Override
//    public int sum(int a, int b) {
//        return a+b; //추상메서드를 구현함
//    }
//}

public class 람다 {
    public static void main(String[] args) {
        //Calulator mc = new MyCalculator();
        Calulator mc = (int a, int b) -> a + b;
        int result = mc.sum(3,4);
        System.out.println(result);
    }
}
