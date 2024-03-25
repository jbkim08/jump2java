package ch05_7;

interface Predator {
    //인터페이스 선언 class대신 interface사용
    String getFood(); //추상메서드 : 메서드 코드가 없음 (리턴과 입력만)
    //디폴트메소드는 추상메소드와 달리 공통적으로 사용가능한 메소드
    default void printFood(){
        System.out.printf("내 사료는 %s\n",getFood());
    }
}
class Animal {
    String name;
    void setName(String name){
        this.name = name;
    }
}
//인터페이스는 클래스에서 implements로 구현한다.
class Tiger extends Animal implements Predator {
    //인터페이스 구현시 추상메소드를 무조건 구현해야 한다.
    @Override
    public String getFood() {
        return "apple";
    }
}

class Lion extends Animal implements Predator {

    @Override
    public String getFood() {
        return "banana";
    }
}

public class 인터페이스 {
    public static void main(String[] args) {
        Predator tiger = new Tiger(); //호랑이 객체
        Predator lion = new Lion(); //사자 객체
        System.out.println(tiger.getFood());
        System.out.println(lion.getFood());
        tiger.printFood();
        lion.printFood();
    }
}
