package s07_자바날개달기;

public class 배열예외 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        try {
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스 범위를 벗어남!");
        }
    }
}
