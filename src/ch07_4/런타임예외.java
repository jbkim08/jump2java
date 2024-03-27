package ch07_4;

class FoolException extends RuntimeException {
    //런타임예외를 상속받은 커스텀 예외클래스
    //런타임예외는 미리 처리하지 않아도 됨.
}

public class 런타임예외 {
    public void sayNick(String nick) {
        if("바보".equals(nick)){
            throw new FoolException(); //바보예외를 생성 throw new 예외();
        }
        System.out.println("당신의 별명은 " + nick + " 입니다.");
    }
    public static void main(String[] args) {
        런타임예외 s = new 런타임예외();
        try {
            s.sayNick("바보");
            s.sayNick("야호");
        } catch (FoolException e) {
            System.err.println("Fool 예외가 발생했습니다.");
        }
    }
}
