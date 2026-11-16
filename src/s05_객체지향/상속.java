package s05_객체지향;

class Animal2{
    String name;
    void setName(String name) {
        this.name = name;
    }
}
//Dog 클래스가 부모 Animal2클래스 상속
class Dog extends Animal2 {
    void sleep(){
        System.out.println(this.name + " zzz");
    }
}
// 부모의 sleep 메소드를 자식에서 덮어씀 => 메소드 오버라이딩(overriding)
class HouseDog extends Dog {
    void sleep(){
        System.out.println(this.name + " zzz in house");
    }
    //메소드의 매개변수가 다르면 => 다른메소드 (메소드 오버로딩)
    void sleep(int hour){
        System.out.println(this.name + " zzz in house 시간:" + hour);
    }
}
public class 상속 {
    public static void main(String[] args) {
        Dog dog = new Dog(); //도그 객체
        dog.setName("poppy"); //이름 입력
        System.out.println(dog.name);
        dog.sleep();
        //부모 자식 관계를 객체로 표시
        Animal2 d = new Dog(); //객체는 도그 변수는 Animal2 가능
        //반대는 안됨
        //Dog a = new Animal2(); 에러
        HouseDog hd = new HouseDog();
        hd.setName("happy");
        hd.sleep();
        hd.sleep(5);
    }
}
