package s03_자바의기초;

import java.util.ArrayList;

public class 리스트 {
    public static void main(String[] args) {
        // ArrayList 길이는 정해지지 않음
        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("10"); //0
        pitches.add("20"); //1
        pitches.add("30"); //2
        System.out.println(pitches.get(1));
        // 리스트의 사이즈(갯수)
        System.out.println(pitches.size());
        // 리스트 안에 있는지?
        System.out.println(pitches.contains("30"));
        // 제거하기 remove(아이템), true 리턴
        System.out.println(pitches.remove("10"));
        // 제거하기 인덱스 번호, 리턴 삭제된 값
        System.out.println(pitches.remove(0));

        // 정수 리스트 만들기
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
    }
}
