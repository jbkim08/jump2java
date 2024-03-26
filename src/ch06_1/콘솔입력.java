package ch06_1;

import java.io.IOException;
import java.io.InputStream;

public class 콘솔입력 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        int a;
        int b;
        int c;

        a = in.read(); //콘솔에서 받은 입력을 input에 대입
        b = in.read();
        c = in.read();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
