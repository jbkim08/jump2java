package s03_자바의기초;

public class 숫자 {
    public static void main(String[] args) {
        /*
         int 정수(기본) long 큰정수
         */
        int age = 10;
        long count = 78979864646L;
        /*
         double 실수(기본) , float 작은 실수
         */
        double pi = 3.142187398121298329;
        float pi2 = 3.14f;
        /*
        8진수(0시작) 와 16진수(0x)
         */
        int n1 = 023; //19
        System.out.println(n1);
        int n2 = 0xC3; //195
        System.out.println(n2);
        /*
        숫자 연산
         */
        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        // % 나머지
        System.out.println(7%3); //1
        System.out.println(3%7); //3
        /*
        증감연산 ++ -- 1씩 증가 1씩 감소
         */
        int i = 0;
        int j = 10;
        i++; //1
        j--; //9
        System.out.println(++i); // 2출력 (먼저 증가)
        System.out.println(j--); //출력은 9 그러나 다음줄에서는 8
        System.out.println(j);

    }
}
