package ch03_7;


import java.util.ArrayList;

public class 제네릭스 {
    public static void main(String[] args) {
        //문자열 타입 리스트
        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches);
        //정수 타입 리스트
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
    }
}
