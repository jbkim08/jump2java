package ch07_3;

class Singleton {
    //싱글턴 패턴: 단 하나의 객체를 만드는 방법
    private static Singleton one; //다른클래스에서 접근불가
    private Singleton() {} //생성자를 private으로 다른클래스에서 만들지 못함
    public static Singleton getInstance() {
        if(one == null){
            one = new Singleton(); //처음 한번 객체가 생성됨.
        }
        return one;
    }
}

public class 싱글턴 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance(); //객체생성
        Singleton s2 = Singleton.getInstance(); //같은객체
        Singleton s3 = Singleton.getInstance(); //같은객체

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
    }
}
