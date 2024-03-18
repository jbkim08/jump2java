package ch03_1;

public class S_증감연산 {
    public static void main(String[] args) {
        int i=0;
        int j=10;
        i++;
        j--;

        System.out.println(i);
        System.out.println(j);

        //연산자의 위치! 앞:먼저 증감 뒤:나중에 증감
        i = 0;
        System.out.println(i++); //0
        System.out.println(i);  //1

    }
}
