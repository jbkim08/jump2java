package s06_자바의입출력;

import java.io.*;

public class 파일읽기 {
    public static void main(String[] args) throws IOException {
//        byte[] b = new byte[1024]; //1kb 씩 읽기
//        FileInputStream input = new FileInputStream("out.txt");
//        input.read(b);
//        System.out.println(new String(b)); //byte를 문자열로 변경
//        input.close();
        BufferedReader br = new BufferedReader(new FileReader("out.txt"));
        while (true){
            String line = br.readLine();
            if (line == null)  break; //반복문 종료
            System.out.println(line);
        }
        br.close();
    }
}
