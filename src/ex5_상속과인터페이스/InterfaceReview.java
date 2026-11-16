package ex5_상속과인터페이스;

import java.util.ArrayList;

public class InterfaceReview {
    public static void main(String[] args) {
        // 객체 생성 ( 업 캐스팅 : 상속부모 또는 인터페이스 로 선언)
        Sounding dog = new Dog();
        Sounding baby = new Baby();
        Sounding tiger = new Tiger();
        Sounding robot = new Robot2();
        // ArrayList를 통한 객체 저장
        ArrayList<Sounding> list = new ArrayList<Sounding>();
        list.add(dog);
        list.add(baby);
        list.add(tiger);
        list.add(robot);
        // 소리내기
        for (int i = 0; i < list.size(); i++) {
            list.get(i).sound();
        }
    }
}
interface Sounding {
    public void sound();
}
class Dog implements Sounding {
    public void sound() {
        System.out.println("Dog: 멍멍!");
    }
}
class Baby implements Sounding {
    public void sound() {
        System.out.println("Baby: 응애!");
    }
}
class Tiger implements Sounding {
    public void sound() {
        System.out.println("Tiger: 어흥!");
    }
}
class Robot2 implements Sounding {
    public void sound() {
        System.out.println("Robot: 삐빕!");
    }
}