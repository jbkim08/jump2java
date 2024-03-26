package ch06_2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class 프린트라이터 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("out3.txt");
        for(int i=1; i<11; i++){
            String data = i+" 번째 줄입니다.";
            pw.println(data); //문자열을 쓰기
        }
        pw.close();
    }
}
