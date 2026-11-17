package s06_자바의입출력;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class 파일쓰기 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream output = new FileOutputStream("out.txt");
//        for (int i = 1; i < 11; i++) {
//            String data = i + " 번째 줄입니다. \r\n";
//            output.write(data.getBytes());
//        }
//        output.close(); //파일객체 종료
//        FileWriter fw = new FileWriter("out.txt");
//        for (int i = 1; i < 11 ; i++) {
//            String data = i + "번째 줄입니다. \r\n";
//            fw.write(data);
//        }
//        fw.close();
        PrintWriter pw = new PrintWriter(new FileWriter("out.txt", true));
        for (int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.";
            pw.println(data);
        }
        pw.close();
    }
}
