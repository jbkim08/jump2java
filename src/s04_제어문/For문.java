package s04_제어문;

import java.util.ArrayList;
import java.util.Arrays;

public class For문 {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three"};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // 학생 시험 60점 이상 합격
        int[] marks = {90, 25, 67, 45, 80};
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] >= 60){
                System.out.println((i+1)+"번 학생은 합격입니다.");
            } else {
                //System.out.println((i+1)+"번 학생은 불합격입니다.");
            }
        }

        //구구단 2중 for 문
        for (int i = 2; i < 10 ; i++) {
            for (int j = 1; j < 10 ; j++) {
                System.out.printf("%d X %d = %d\n", i, j, i*j);
            }
            System.out.println("==============================");
        }

        // for each 문 ( 배열 또는 리스트 )
        ArrayList<String> nums = new ArrayList<>(Arrays.asList("one","two","three"));
        for (String n : nums){
            System.out.println(n);
        }
    }
}
