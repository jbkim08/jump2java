package ch07_4;

import java.io.*;

public class Ch07_예외처리 {
    public static void main(String[] args) {
        //파일 찾기 예외처리
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\it\\IdeaProjects\\jump2java\\없는파일.txt"));
            //파일 읽을수 없을경우 예외처리
            br.readLine();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일 못찾음 예외발생 " + e.getMessage());
        } catch (IOException e) {
            System.out.println("파일 읽기 또는 닫기 예외발생 " + e.getMessage());
        }


        //산술에 문제
        try {
            int c = 4/0; //예외발생 코드는 try 문에 입력
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("수학예외 0으로 나누는 에러 발생!" + e.getMessage());
        } finally {
            System.out.println("에러발생 하든 안하든 실행됨!");
        }

        //배열의 인덱스 번호가 틀림 (실행중 발생함)
        try {
            int[] a = {1,2,3};
            System.out.println(a[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위를 넘기는 예외!" + e.getMessage());
        } finally {
            System.out.println("에러발생 하든 안하든 실행됨!");
        }

        System.out.println("프로그램 종료!");
    }
}
