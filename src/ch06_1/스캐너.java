package ch06_1;

import java.io.InputStream;
import java.util.Scanner;

public class 스캐너 {
    public static void main(String[] args) {
        //InputStream in = System.in;
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());
        scanner.close();//사용후 닫기(메모리 절약)
    }
}
