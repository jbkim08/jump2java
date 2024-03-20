package ch03_9;


import java.util.Arrays;
import java.util.HashSet;

public class 집합 {
    public static void main(String[] args) {
        //집합(set) : 순서가 없고 중복되지 않음.
        HashSet<String> set = new HashSet<>(Arrays.asList("h","e","l","l","o"));
        System.out.println(set);
        //교집합
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        //초기값을 s1으로 intersection 집합을 만듬
        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2); //교집합만 남김
        System.out.println(intersection);
        //합집합
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2); //s1과 s2모두 더함(중복제외)
        System.out.println(union);
        //차집합
        HashSet<Integer> subset = new HashSet<>(s1);
        subset.removeAll(s2); //s2로 빼기
        System.out.println(subset);
    }
}
