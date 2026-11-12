package s03_자바의기초;

public class 형변환 {
    public static void main(String[] args) {
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);
        String num2 = "3.14";
        double n2 = Double.parseDouble(num2);
        System.out.println(n2);
        //정수를 문자열로
        int n3 = 123;
        String num3 = ""+n3; //숫자+문자열 => 문자열
        System.out.println(num3);
        String num4 = String.valueOf(n3);

        //정수와 실수 사이의 형변환
        int n4 = 123;
        double d1 = n4; //정수를 실수로 바꿀때는 캐스팅 필요없음
        System.out.println(d1);
        double d2 = 123.456;
        int n5 = (int)d2; //실수는 정수변환시 데이터가 짤리기 때문에 캐스팅 (int) 필요
        System.out.println(n5);


    }
}
