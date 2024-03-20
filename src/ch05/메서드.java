package ch05;

public class 메서드 {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("바디"); //메소드 호출
        System.out.println(cat.name);

        Animal dog = new Animal();
        dog.setName("해피");
        System.out.println(dog.name);
    }
}
