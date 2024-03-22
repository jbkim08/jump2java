package 클래스;

public class Starcraft {
    public static void main(String[] args) {
        //객체생성
        Marine marine = new Marine("마린", 80);
        Medic medic = new Medic("메딕", 60);
        //마린 스팀팩
        marine.stimpack();
        //메딕이 마린을 치료
        medic.heal(marine);
    }
}

//마린클래스
class Marine {
    //필드
    String name;
    int hp;
    //생성자(필드값 초기화)
    public Marine(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    //메소드
    public void stimpack(){
        System.out.printf("[%s]의 스팀팩! HP: %d -> ", name, hp);
        hp = hp - 10; //hp 10감소
        System.out.printf("%d\n",hp); //감소된 hp값을 표시하고 한줄뛰움
    }
}

//메딕 클래스
class Medic {
    //필드
    String name;
    int hp;
    //생성자
    public Medic(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    //메소드
    public void heal(Marine target){
        System.out.printf("[%s]의 치유! %s HP(%d -> ", name, target.name, target.hp);
        target.hp = target.hp + 10; //10만큼 치유
        System.out.printf("%d)\n", target.hp);
    }
}