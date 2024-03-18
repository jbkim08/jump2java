package ch03_4;

public class S_내장메서드 {
    public static void main(String[] args) {
        //indexOf:문자열에서 특정 문자열이 시작되는 위치(인덱스값) 리턴
        String a = "Hello Java";
        System.out.println(a.indexOf(" "));
        //contains: 문자열에서 특정 문자열이 포함되어 있는지 참 거짓을 리턴
        System.out.println(a.contains("Java"));
        //charAt: 문자열에서 특정 위치의 문자를 리턴
        System.out.println(a.charAt(6));
        //replaceAll: 문자열에서 특정 문자열을 다른 문자열로 바꿈
        System.out.println(a.replaceAll("Java", "World"));
        //substring: 특정 문자열을 뽑아낼때 사용(시작위치, 끝나는위치(불포함))
        System.out.println(a.substring(6,10)); //Hell
        //toUpperCase 대문자 , toLower
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        //split 특정한 구분자로 나누어 배열로 리턴
        String b = "a:b:c:d";
        System.out.println(a.split(":")); //["a","b","c","d"]
    }
}
