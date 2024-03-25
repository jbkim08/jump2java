package ch05_7;

interface Describable {
    //보통 인터페이스는 ~able로 끝남
    String getDescription(); //추상메서드
}
class Person implements Describable{
    @Override
    public String toString() {
        //toString메서드는 Object에서 객체의 주소출력(기본)
        //return super.toString(); //super는 부모객체, this는 내객체
        return "Person객체 입니다. 필드변수 없음";
    }

    @Override
    public String getDescription() {
        return "Person 입니다.";
    }
}
class Computer implements Describable {

    @Override
    public String toString() {
        return "컴퓨터 객체 입니다. 필드변수 없음";
    }

    @Override
    public String getDescription() {
        return "computer 입니다.";
    }
}

public class 예제 {
    public static void main(String[] args) {

        //Object클래스는 모든 클래스의 부모클래스(기본)
        Describable[] objs = {new Person(), new Computer()};

        for(Describable obj: objs){
            System.out.println(obj.getDescription());
        }

    }
}
