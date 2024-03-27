package ch07_4;

class Fool2Exception extends Exception {
    //일반예외를 상속받은 커스텀 예외클래스
}

public class 일반예외 {
    public void sayNick(String nick) throws Fool2Exception {
        if("바보".equals(nick)){
            throw new Fool2Exception(); //일반예외는 예외처리를 해야함(throws)
        }
        System.out.println("당신의 별명은 " + nick + " 입니다.");
    }
    public static void main(String[] args) {
        일반예외 s = new 일반예외();
        try {
            s.sayNick("바보");
            s.sayNick("야호");
        } catch (Fool2Exception e) {
            System.err.println("Fool 예외가 발생했습니다.");
        }
    }
}
