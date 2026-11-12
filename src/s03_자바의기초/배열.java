package s03_자바의기초;

public class 배열 {
    public static void main(String[] args) {
        // 정수 배열
        int[] odds = {1,3,5,7,9};
        // 문자열 배열
        String[] week = {"월","화","수","목","금"};
        /*
        배열의 길이 배열을 객체로 만들때 길이설정
         */
        String[] weeks = new String[7];
        weeks[0] = "월";
        weeks[1] = "화";
        weeks[2] = "수";
        weeks[3] = "목";
        weeks[4] = "금";
        weeks[5] = "토";
        weeks[6] = "일";

        System.out.println(weeks[3]);
        System.out.println(week[3]);

        // 배열의 길이 .length
        System.out.println(week.length);
        System.out.println(weeks.length);

        //배열의 길이를 이용해 배열 모든 요소를 출력
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
        }
        //배열에 없는 인덱스 번호
        System.out.println(weeks[7]);

    }
}
