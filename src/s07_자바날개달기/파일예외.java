package s07_자바날개달기;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 파일예외 {
    public static void main(String[] args)  {
        try {
            BufferedReader br = new BufferedReader(new FileReader("없는파일"));
            br.readLine();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다!");
        } catch (IOException e) {
            System.out.println("파일을 읽는데 예외발생!");
        }
        System.out.println("정상종료!");
    }
}
