package ch04_3;

public class While_continue {
    public static void main(String[] args) {
        int a = 0;
        while(a<10){
            a++;
            if(a%2==0){
                continue; //a가 짝수일때 바로 조건으로 돌아감
            }
            System.out.println(a);
        }
    }
}
