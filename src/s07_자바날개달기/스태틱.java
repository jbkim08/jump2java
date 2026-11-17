package s07_자바날개달기;

class Counter {
    static int count = 0;
    Counter(){
        this.count++;
        System.out.println("카운터 : " + this.count);
    }
}

public class 스태틱 {
    public static void main(String[] args) {
        System.out.println(Counter.count); //객체 만들기 전 확인
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(Counter.count);
        System.out.println(Math.PI);
    }
}
