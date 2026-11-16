package ex6_자바API;

public class KnightTest {
    public static void main(String[] args) {
        // 객체 생성
        Knight knight1 = new Knight("돈키호테", 30);
        // 정보 출력
        System.out.println("[객체 생성]");
        System.out.printf("\t%s\n", knight1.toString());
        // 체력 증가: 기존 체력 + 30
        knight1.setHp(knight1.getHp() + 30);
        // 결과 출력
        System.out.println("[체력 증가 +30]");
        System.out.printf("\t%s\n", knight1.toString());
    }
}
class Knight {
    // 필드
    private String name;
    private int hp;
    //생성자
    public Knight(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    //get 메소드는 값을 그대로 읽어서 리턴
    public int getHp() {
        return hp;
    }
    //set 메소드는 값을 그대로 입력(업데이트)
    public void setHp(int hp) {
        this.hp = hp;
    }
    // 객체의 정보를 표시
    public String toString() {
        return String.format("Knight { name: %s, hp: %d }", this.name, this.hp);
    }

}