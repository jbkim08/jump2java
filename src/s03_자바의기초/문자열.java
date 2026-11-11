package s03_자바의기초;

public class 문자열 {
    public static void main(String[] args) {
        /*
        문자열 String 1. " " 쌍따옴표 2. new 키워드
         */
        String a = "Happy Java"; //리터럴 표기(고정된 값)
        String b = "a";
        String c = "123";
        String d = new String("Happy Java"); //객체 new
        System.out.println(d);
        /*
        문자열은 원시(primitive) 자료형이 아니다.
        int long float double, boolean, char => 원시 자료형
         */
        /*
        문자열 메서드
        equals 문자열의 값이 같은지 확인
         */
        String a1 = "hello";
        String a2 = "java";
        String a3 = "hello";
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));

        // indexOf 문자열 시작위치
        String b2 = "Hello Java";
        System.out.println(b2.indexOf("Java"));
        // contains 문자열 포함 여부 확인
        System.out.println(b2.contains("Java"));
        // charAt 문자열의 위치에 문자를 리턴
        System.out.println(b2.charAt(6)); //J
        // replaceAll 문자열 교체
        System.out.println(b2.replaceAll("Java", "자바"));
        // substring 특정 문자열을 뽑아낼때
        System.out.println(b2.substring(0,4));

        /*
        문자열 포매팅 String.format
         */
        System.out.println(String.format("나는 계란을 %d개 먹는다.", 2));
        System.out.println(String.format("나는 계란을 %s개 먹는다.", "두"));
        System.out.println(String.format("원주율은 %.2f 이다.", 3.145349858));
        // 간략하게 printf
        System.out.printf("나는 계란을 %d개 먹는다.", 2);
        System.out.printf("원주율은 %.2f 이다.", 3.145349858);


    }
}
