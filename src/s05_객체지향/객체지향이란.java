package s05_객체지향;

class Calculator {
    int result = 0;
    int add(int num){
        result += num;
        return result;
    }
}
public class 객체지향이란 {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));
        Calculator cal2 = new Calculator();
        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));
    }
}
