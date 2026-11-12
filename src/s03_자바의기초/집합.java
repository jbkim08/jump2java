package s03_자바의기초;

import java.util.Arrays;
import java.util.HashSet;

public class 집합 {
    public static void main(String[] args) {
        //순서가 없고 중복이 되지 않음
        HashSet<String> set = new HashSet<>();
        set.add("h");
        set.add("e");
        set.add("l");
        set.add("l");
        set.add("o");
        System.out.println(set);

        // 교집합
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        HashSet<Integer> 교집합 = new HashSet<>(s1); //1,2,3,4,5,6
        교집합.retainAll(s2); //교집합에서 같은 4,5,6만 남김
        System.out.println(교집합);

        // 합집합
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union);

        // 차집합
        HashSet<Integer> sub = new HashSet<>(s1); //s1카피
        sub.removeAll(s2);
        System.out.println(sub);

    }
}
