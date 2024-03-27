package ch08;

//1000미만의 3과 5의 배수의 합은 ?
public class 배수합하기 {
    public static void main(String[] args) {
        //1~999까지 출력해보자
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if(i%3 == 0 || i%5 == 0){
                sum = sum + i;
            }
        }
        System.out.println("3과5의배수 총합 : "+sum);
    }
}
