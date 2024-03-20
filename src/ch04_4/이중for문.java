package ch04_4;

public class 이중for문 {
    public static void main(String[] args) {
        //for문을 2번사용하여 구구단 출력
        for(int i=2; i<10; i++){
            for(int j=1; j<10; j++){
                System.out.printf("%dX%d=%d ",i,j,i*j);
            }
            System.out.println(); //한줄뛰움
        }
    }
}
