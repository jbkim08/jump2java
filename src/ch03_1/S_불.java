package ch03_1;

public class S_불 {
    public static void main(String[] args) {
        int base = 180;
        int height = 185;
        boolean isTall = height > base; //true!
        System.out.println(isTall);

        if(isTall){
            System.out.println("키가 큽니다.");
        }

        //2
        int i=3;
        boolean isOdd = i%2 == 1;
        System.out.println(isOdd);
    }
}
