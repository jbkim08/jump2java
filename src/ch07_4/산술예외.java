package ch07_4;

public class 산술예외 {
    public static void main(String[] args) {
        int c; //블록 밖에서 선언시 블록 안에서 사용가능
        try {
            //try 문에는 예외 가능성이 있는 코드를 넣는다.
            c = 4 / 2; //0으로 나누면 예외발생
        } catch (ArithmeticException e){
            c = -1; //예외가 발생하면 실행됨(예외처리)
        }
        System.out.println("c : " + c);

    }
}
