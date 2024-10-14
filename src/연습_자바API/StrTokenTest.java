package 연습_자바API;

import java.util.StringTokenizer;

public class StrTokenTest {
	public static void main(String[] args) {
	    // 입력 문자열
	    String str = "치킨,피자,보쌈,족발,초밥,떡볶이,탕수육";

		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
