package s03_자바의기초;

import java.util.ArrayList;
import java.util.Arrays;

public class 파이널 {
    public static void main(String[] args) {
        final int n = 123; //상수 final 값을 바꿀수 없다.
        //n = 7; 오류발생
        final ArrayList<String> list = new ArrayList<>(Arrays.asList("a","b","c"));
        // list = new ArrayList<>(Arrays.asList("d","f","g")); 오류발생

    }
}
