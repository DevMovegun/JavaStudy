package lecture.chap_02;

public class _01_TernaryOperator {
    public static void main(String[] args) {

        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(x + "와 " + y + " 중 큰 숫자는 " + max); // result : 5와 3 중 큰 숫자는 5

        int m = 7;
        int n = 11;
        System.out.println(m + "과 " + n + " 중 큰 숫자는 " + ((m > n) ? m : n)); // result : 7과 11 중 큰 숫자는 11


    }
}
