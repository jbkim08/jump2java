package 자바API;

import java.util.StringTokenizer;

public class StrTokenTest {
	public static void main(String[] args) {
	    // 입력 문자열
	    String str = "치킨,피자,보쌈,족발,초밥,떡볶이,탕수육";

		StringTokenizer st = new StringTokenizer(str, ",");

		//분리된 토큰이 있으면 계속 반복 없으면 종료
		while (st.hasMoreTokens()) {
			String token = st.nextToken(); //토큰을 하나 가져옴
			System.out.println(token);
		}
	}
}
