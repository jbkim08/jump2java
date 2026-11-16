package ex5_상속과인터페이스;

public class Ex07 {
    public static void main(String[] args) {
        // 1. 객체 생성
        Drone drone = new Drone("[드론]");
        Tank tank = new Tank("[탱크]");

        // 2. 드론 작동
        drone.move();
        drone.fly();

        // 3. 탱크 작동
        tank.move();
        tank.attack();
    }
}

// 부모 클래스
class Robot {
    String name;
    public Robot(String name) {
        this.name = name;
    }
    public void move() {
        System.out.printf("%s이 이동합니다.\n", name);
    }
}

// 인터페이스 정의
interface Flyable {
    void fly();
}

interface Attackable {
    void attack();
}

// 1. Drone 클래스를 완성하세요 (Robot 상속, Flyable 구현)
class Drone extends Robot implements Flyable {
    public Drone(String name) {
        super(name);
    }
    @Override
    public void fly() {
        System.out.printf("%s이 하늘을 납니다.\n", name);
    }
}

// 2. Tank 클래스를 완성하세요 (Robot 상속, Attackable 구현)
class Tank extends Robot implements Attackable {
    public Tank(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.printf("%s가 레이저를 쏩니다.\n", name);
    }
}
