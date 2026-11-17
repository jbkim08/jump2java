package s07_자바날개달기;
//예외클래스 상속하면 예외가 됨
class FoolException extends Exception { }

public class 예외활용 {
    public static void sayNick(String nick){
        try {
            if("바보".equals(nick)){
                throw new FoolException(); //예외 직접 발생시킴
            }
            System.out.println("당신의 별명은 "+ nick + " 입니다.");
        } catch (FoolException e) {
            System.err.println("FoolException 발생!");
        }
    }
    public static void main(String[] args) {
        sayNick("바보");
        sayNick("야호");

    }
}
