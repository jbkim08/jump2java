package ch05;

//계산기 클래스 만듬
class Calculator {
    int result = 0;
    int add(int num){
        result += num;
        return result;
    }
}

public class 객체예제 {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator(); //객체생성 cal1
        System.out.println(cal1.add(3)); //3
        System.out.println(cal1.add(4)); //7
        Calculator cal2 = new Calculator(); //객체생성 cal2
        System.out.println(cal2.add(3)); //3
        System.out.println(cal2.add(7)); //10

    }
}
