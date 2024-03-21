package ch05_5;

class Animal {
    String name;
    void setName(String name){
        this.name = name;
    }
}

class Dog extends Animal {
    //extends 키워드로 부모 Animal 클래스 상속
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

public class 상속 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("퍼피");
        System.out.println(dog.name);
        dog.sleep();
        //부모타입으로 자식객체를 선언 가능
        Animal dog1 = new Dog();
        //반대일때는 오류
        //Dog dog2 = new Animal();
    }
}
