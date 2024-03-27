package ch07_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 파일없음 {
    public static void main(String[] args)  {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("나없는파일"));
            br.readLine();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 못찾았습니다!");
        } catch (IOException e) {
            System.out.println("파일을 읽지 못합니다!");
        }

    }
}
