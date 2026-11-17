package s06_자바의입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 콘솔입력 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in; //키보드 입력
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        String a = br.readLine();
        System.out.println(a);
    }
}
