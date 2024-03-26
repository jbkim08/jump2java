package ch06_2;

import java.io.FileWriter;
import java.io.IOException;

public class 추가로쓰기 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("out2.txt", true);
        for(int i=11; i<21; i++){
            String data = i+" 번째 줄입니다. \r\n";
            fw.write(data); //문자열을 쓰기
        }
        fw.close();
    }
}
