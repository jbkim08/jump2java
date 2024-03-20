package ch04_2;

public class Switch문 {
    public static void main(String[] args) {
        int month = 1;
        String monthString = "";
        switch (month){
            case 1: monthString ="1월달";
                break;
            case 2: monthString ="2월달";
                break;
            case 3: monthString ="3월달";
                break;
            case 4: monthString ="4월달";
                break;
            case 5: monthString ="5월달";
                break;
            case 6: monthString ="6월달";
                break;
            case 7: monthString ="7월달";
                break;
            case 8: monthString ="8월달";
                break;
            case 9: monthString ="9월달";
                break;
            case 10: monthString ="10월달";
                break;
            case 11: monthString ="11월달";
                break;
            case 12: monthString ="12월달";
                break;
            default: monthString ="없는달";
                break;
        }
        System.out.println(monthString);
    }
}
