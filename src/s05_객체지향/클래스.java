package s05_객체지향;

class Animal{
    String name; //객체변수 (인스턴스 변수)
    void setName(String name){
        //this는 이 클래스로 만든 객체
        this.name = name;
    }
}

public class 클래스 {
    public static void main(String[] args) {
        Animal cat = new Animal(); // 새 객체 (인스턴스,instance)
        cat.setName("고양이");
        System.out.println(cat.name);
        Animal dog = new Animal(); // 새 객체
        dog.setName("강아지");
        System.out.println(dog.name);
    }
}
