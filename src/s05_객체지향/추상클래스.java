package s05_객체지향;

//클래스 앞에 abstract 추상클래스 (인터페이스 + 클래스)
abstract class Robot {
    String name;

    public Robot(String name) {
        this.name = name;
    }

    abstract void move(); //추상메소드 가능
}

class Drone extends Robot {
    public Drone(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.printf("%s이 이동합니다.\n", name);
    }
}

class Tank extends Robot {
    public Tank(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.printf("%s가 이동합니다.\n", name);
    }
}

public class 추상클래스 {
    public static void main(String[] args) {
        Robot drone = new Drone("드론");
        Robot tank = new Tank("탱크");
        Robot[] robots = {drone, tank};
        for (int i = 0; i < robots.length; i++) {
            robots[i].move();
        }
    }
}
