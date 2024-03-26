package ch07_3;

class Counter {
    //스테틱 변수는 처음 한번 만들어지고 공유됨
    static int count =0;

    public Counter() {
        count++; //객체생성시 카운트값을 증가
        System.out.println(count);
    }
}


public class 스테틱변수 {
    public static void main(String[] args) {
        //스테틱 변수는 객체없이 사용가능하고 다른객체들도 공유함
        System.out.println(Counter.count);
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
