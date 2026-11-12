package s04_제어문;

import java.util.ArrayList;

public class IF문 {
    public static void main(String[] args) {
        // 비교 불린 이 조건식
        int money = 2000;
        boolean hasCard = true;
        if (money >= 3000 || hasCard) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }


        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("cellphone");
        pocket.add("money");
        // 메소드 리턴이 참 거짓일때
        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        } else if (hasCard) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }
        // 정렬 ctrl + Alt + L

    }
}
