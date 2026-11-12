package s05_객체지향;

class Sample{
    int sum(int a, int b){
        return a + b;
    }
    void hello(String name){
        System.out.println("헬로우! " + name);
    }
}

public class 메서드 {
    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println(s.sum(3,4));
        s.hello("길동");
    }
}
