package s05_객체지향;

class Cat {
    String name;
    String type;
    //기본생성자 생략가능
    //public Cat() {}
    public Cat(String name) {
        this.name = name;
    }
    //생성자 오버로딩은 매개변수 갯수나 타입이 다를때
    public Cat(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
class HouseCat extends Cat {
    public HouseCat(String name) {
        super(name); //슈퍼는 부모의 생성자
    }
}

public class 생성자 {
    public static void main(String[] args) {
        //Cat c1 = new Cat();
        Cat c2 = new Cat("냥이");
        c2.type = "도둑고양이";
        Cat c3 = new Cat("냥냥이", "집고양이");

    }
}
