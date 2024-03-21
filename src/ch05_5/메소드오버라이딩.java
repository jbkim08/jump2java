package ch05_5;

class Cat {
    void sound(){
        System.out.println("야옹~~");
    }
}

class HouseCat extends Cat {
    //오버라이딩 : 부모클래스의 메소드를 다시작성하여 덮어씀
    void sound(){
        System.out.println("냐옹~~");
    }
}

class RoadCat extends Cat {
    void sound(){
        System.out.println("캬옹~~");
    }
}


public class 메소드오버라이딩 {
    public static void main(String[] args) {
        HouseCat cat1 = new HouseCat(); //집고양이
        RoadCat cat2 = new RoadCat(); //길고양이

        cat1.sound();
        cat2.sound();
    }
}
