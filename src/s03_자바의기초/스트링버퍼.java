package s03_자바의기초;

public class 스트링버퍼 {
    public static void main(String[] args) {
        /*
        문자열은 추가하거나 변경이 안됨
         */
        String a = "헬로우";
        String b = "자바";
        a = a + b;
        System.out.println(a);
        b = "파이썬";
        System.out.println(b);
        /*
        StringBuffer 객체는 추가 수정이 가능함
         */
        StringBuffer sb = new StringBuffer(); //객체 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result);
        //특정위치에 문자열을 추가
        sb.insert(0, "오늘시작 ");
        System.out.println(sb.toString());
        // substring 잘라내기
        System.out.println(sb.substring(0, 4));

    }
}
