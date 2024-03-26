package ch07_2;

public class 메인 {
    public static void main(String[] args) {
        S_private p = new S_private("홍길동",17);
        //p.secret = "메인시크릿";
        //p.getSecret(); private 메소드는 다른 클래스에서 사용불가
        //p.setName("홍길동");
        //p.setAge(17);
        System.out.println(p.getName());
        System.out.println(p.getAge());

        //디폴트 접근제어자
        S_default d = new S_default();
        System.out.println(d.lastname);

    }
}
