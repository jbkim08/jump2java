package s07_자바날개달기;

class Singleton {
    //공유하는 단 하나의 객체
    private static Singleton one;
    //외부에서 객체를 못만듬 (생성자가 private)
    private Singleton() {}
    //외부에서 메서드 getInstance 로 단 하나의 객체를 사용함.
    public static Singleton getInstance() {
        if (one == null) {
            one = new Singleton(); //객체를 1번 생성
        }
        return one;
    }
}

public class 싱글톤 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();
        Singleton s5 = Singleton.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1 == s5);
    }
}
