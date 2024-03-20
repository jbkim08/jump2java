package ch04_4;

public class For_continue {
    public static void main(String[] args) {
        int[] marks ={90,25,67,45,80};
        for(int i=0; i<marks.length; i++){
            if(marks[i]<60){
                continue; //60점미만 점수는 출력하지 않고 다시 증감으로 돌아감
            }
            System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
        }
    }
}
