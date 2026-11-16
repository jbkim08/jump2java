package s05_객체지향;

class Animal2{
    String name;
    void setName(String name) {
        this.name = name;
    }
}
//Dog 클래스가 부모 Animal2클래스 상속
class Dog extends Animal2 {
}
public class 상속 {
    public static void main(String[] args) {
        Dog dog = new Dog(); //도그 객체
        dog.setName("poppy"); //이름 입력
        System.out.println(dog.name);
    }
}
