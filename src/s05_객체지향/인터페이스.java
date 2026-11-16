package s05_객체지향;

//인터페이스는 추상메서드(미완성)를 가진다.
interface Predator {
    void hunting();
    default void sleep(){
        System.out.println("잠을 잡니다.zzz");
    }
}
interface Sound {
    void bark();
}
class Tiger extends Cat implements Predator, Sound {
    public Tiger(String name) {
        super(name);
    }
    @Override
    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다!");
    }
    @Override
    public void bark() {
        System.out.println("어흥!");
    }
}
class Lion extends Cat implements Predator, Sound{
    public Lion(String name) {
        super(name);
    }

    @Override
    public void hunting() {
        System.out.println("사자가 사냥을 합니다!");
    }
    @Override
    public void bark() {
        System.out.println("으르릉!");
    }
}

public class 인터페이스 {
    public static void main(String[] args) {
        //인터페이스는 객체를 만들수 없다.
        Tiger tiger = new Tiger("호랑이");
        Lion lion = new Lion("사자");
        tiger.hunting();
        tiger.sleep();
        tiger.bark();
        lion.hunting();
        lion.sleep();
        lion.bark();

    }
}
