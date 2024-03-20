package ch05;

class Animal {
    String name; //객체변수 : 클래스 안에 있는 변수

    public void setName(String name) {
        this.name = name;
    }
}


public class 객체변수 {
    public static void main(String[] args) {
        Animal cat = new Animal(); //cat 객체 생성
        System.out.println(cat.name);
        cat.name = "고양이"; //객체변수에 값을 입력
        System.out.println(cat.name);
        Animal cat2 = new Animal(); //cat2 객체 생성
        System.out.println(cat2.name);
        cat2.name = "고라니";
        System.out.println(cat2.name);
    }
}
