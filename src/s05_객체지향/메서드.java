package s05_객체지향;

class Sample{
    int sum(int a, int b){
        return a + b;
    }
    void hello(String name){
        System.out.println("헬로우! " + name);
    }
    void sayNick(String nick){
        if("바보".equals(nick)){
            return; //메소드 종료
        }
        System.out.println("나의 별명은 "+ nick + "입니다.");
    }
}

public class 메서드 {
    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println(s.sum(3,4));
        s.hello("길동");
        s.sayNick("바보");
        s.sayNick("야호");
    }
}
