package ch07_4;

public class 배열예외 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        try {
            System.out.println(a[3]);
            System.out.println("예외발생시 실행안됨!");
        } catch (Exception e) {
            System.out.println("배열의 범위를 벗어났습니다.");
        } finally {
            System.out.println("무조건 실행되는 코드");
        }

        System.out.println("정상종료!");
    }
}
