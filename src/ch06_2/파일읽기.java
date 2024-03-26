package ch06_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 파일읽기 {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024]; //바이트 배열
        FileInputStream input = new FileInputStream("out.txt");
        input.read(b);
        System.out.println(new String(b)); //byte배열을 문자열로 변경하여 출력
        input.close();
    }
}
