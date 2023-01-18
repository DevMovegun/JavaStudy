package lecture.chap_01;

public class _01_TypeCasting {
    public static void main(String[] args) {

        // int 형을 String 으로 변환하는 2가지 방법
        String s1 = String.valueOf(100);
        String s2 = Integer.toString(101);
        System.out.println("s1 = " + s1 + " s2 = " + s2); // s1 = 100 s2 = 101

        // double 형을 String 으로 변환하는 2가지 방법
        s1 = String.valueOf(98.8);
        s2 = Double.toString(98.9);
        System.out.println("s1 = " + s1 + " s2 = " + s2); // s1 = 98.8 s2 = 98.9

        // String을 숫자로 변환
        int i = Integer.parseInt("100");
        double d = Double.parseDouble("98.8");
        System.out.println("i = " + i + " d = " + d); // i = 100 d = 98.8
    }
}
