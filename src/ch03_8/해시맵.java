package ch03_8;

import java.util.HashMap;

public class 해시맵 {
    public static void main(String[] args) {
        //맵은 key와 value로 사용 인덱스가 없음
        HashMap<String,String> map = new HashMap<>();
        //put(key,value)로 추가하기
        map.put("people", "사람");
        map.put("baseball", "야구");
        map.put("apple", "사과");
        //get(키)로 value를 꺼냄
        System.out.println(map.get("baseball"));
        //containsKey 키가 있으면 참 없으면 거짓
        System.out.println(map.containsKey("people"));
        //remove(키)로 삭제하고 value가 리턴
        System.out.println(map.remove("people"));
        System.out.println(map);
        //아이템 갯수
        System.out.println(map.size());
        //keySet 키값들만 모아 리턴
        System.out.println(map.keySet());
        System.out.println(map.values());

    }
}
