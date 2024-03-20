package ch03_7;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열로리스트 {
    public static void main(String[] args) {
        String[] data = {"138", "129", "142"}; //배열
        //Arrays.asList(배열)로 리스트 변환
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches);
        //Arrays.asList(1,2,3)로 리스트 변환
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(nums);
    }
}
