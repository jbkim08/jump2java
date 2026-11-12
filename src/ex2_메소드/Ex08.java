package ex2_메소드;

public class Ex08 {
    public static void main(String[] args) {
        // 변수 생성
        int a = 13;
        int b = 7;
        int c = 10;

        // 결과 출력
        System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
        System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
        System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
    }

    public static String guide(int n) {
        /* 메소드를 완성하시오. */
        if(n >= 1 && n <= 10){
            return "저층";
        } else if (n >= 11 && n <= 20) {
            return "고층";
        } else {
            return "잘못된 층";
        }
    }
}
