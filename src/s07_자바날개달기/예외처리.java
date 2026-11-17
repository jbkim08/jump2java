package s07_자바날개달기;

public class 예외처리 {
    public static void main(String[] args) {
        // try - catch 문 처리
        int c = 0;
        try {
            c = 4 / 0;
        } catch (ArithmeticException e) {
            c = -1;
        } finally {
            System.out.println("무조건 나옴: " + c);
        }

    }
}
