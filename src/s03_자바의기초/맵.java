package s03_자바의기초;

import java.util.HashMap;

public class 맵 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        //put 으로 입력
        map.put("people", "사람");
        map.put("baseball", "야구");
        //get 으로 가져옴 key
        System.out.println(map.get("people"));
        //키값이 있는지 확인
        System.out.println(map.containsKey("people"));
        //삭제 (키) 삭제된 값 리턴
        //System.out.println(map.remove("people"));
        //개수
        System.out.println(map.size());
        //모든 키 리턴
        System.out.println(map.keySet());
    }
}
