package ch03_4;

public class S_포매팅 {
    public static void main(String[] args) {
        int appleNumber = 7;
        String s = String.format("나는 사과 %d를 먹는다.", appleNumber);
        System.out.println(s);

        String appleString = "다섯개";
        String s2 = String.format("나는 사과 %s를 먹는다.", appleString);
        System.out.println(s2);
        // 2개의 값을 넣기
        String s3 = String.format("나는 사과를 %d개 먹고 너는 %s를 먹어라",appleNumber,appleString);
        System.out.println(s3);
        // 정렬과 공백 표현하기
        System.out.println(String.format("%10s","hi."));
        // 공백을 뒤에주기
        System.out.println(String.format("%-10s제인","hi."));
        // 소수점 표현 (%f)
        System.out.println(String.format("%.4f", 3.4213123123123));
        System.out.println(String.format("%10.4f", 3.4213123123123));
    }

}
