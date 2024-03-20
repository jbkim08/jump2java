package ch05;

public class 메서드예제 {
    //메서드의 입력변수는 메서드 내에서만 사용됨
    int sum(int a, int b){
        return a + b;
    }
    //리턴이 없는 메서드
    void noReturn(){
        System.out.println("입력도 없고 리턴도 없음!");
    }
    //이름을 입력받아 문자열로 리턴하는 메서드
    String myName(String name){
        return "내 이름은 " + name + "입니다.";
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        메서드예제 sample = new 메서드예제();
        System.out.println(sample.sum(a,b));
        System.out.println(sample.sum(9,7));
        sample.noReturn();
        System.out.println(sample.myName("홍길동"));
    }
}
