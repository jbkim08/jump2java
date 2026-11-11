package s03_자바의기초;

public class 불 {
    public static void main(String[] args) {
        // 불 boolean, 조건식의 결과
        boolean isSuccess = true;
        boolean isTest = false;
        boolean a = 2 > 1; //true
        boolean b = 3%2 == 1; //true

        int base = 180;
        int height = 185;
        boolean isTall = height > base;
        if(isTall){
            System.out.println("키가 큽니다.");
        }

        int i = 3;
        boolean isOdd = i % 2 == 1;
        System.out.println(isOdd);

    }
}
