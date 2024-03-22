package 클래스;

public class SquareTest {
    public static void main(String[] args) {
        /* 1. 객체 생성 */
        int a = 10; //기본타입은 변수가 값을 가짐
        Square s = new Square(); //클래스타입은 주소를 가짐
        System.out.println(s);
        /* 2. 필드 초기화(값 변경) */
        s.length = 4;
        /* 3. 결과 출력 */
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d", s.length, s.area());

    }
}

//정사각형 클래스
class Square {
    int length; //길이
    //넓이반환 메소드
    int area(){
        return length*length;
    }
}