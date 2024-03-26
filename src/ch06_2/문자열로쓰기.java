package ch06_2;

import java.io.FileWriter;
import java.io.IOException;

public class 문자열로쓰기 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("out2.txt");
        for(int i=1; i<11; i++){
            String data = i+" 번째 줄입니다. \r\n";
            fw.write(data); //문자열을 쓰기
        }
        fw.close();
    }
}
