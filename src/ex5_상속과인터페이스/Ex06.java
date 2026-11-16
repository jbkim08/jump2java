package ex5_상속과인터페이스;

public class Ex06 {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();

        taxi.start();
        taxi.stop(2500);
    }
}

interface Meter {
    public int BASE_FARE = 3000; // 기본요금(인터페이스에 정의한 변수는 상수라서 변경할 수 없습니다.)
    public void start();
    public void stop(int distance);
}

class Taxi implements Meter {
    // Meter인터페이스의 start와 stop메소드를 구현해야 합니다.
    @Override
    public void start() {
        System.out.println("운행을 시작합니다.");
    }

    @Override
    public void stop(int distance) {
        int fare = BASE_FARE + (distance * 2);
        //코드 완성하기
        System.out.println("운행을 종료합니다. 요금은 " + fare + "원 입니다.");
    }

}
