package lecture.chap_03;

public class _03_StringMethods {
    public static void main(String[] args) {

        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true, 다르면 false
                                            // false
        System.out.println(s1.equals("Java")); // true
        System.out.println(s2.equals("python")); // false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분없이 check
                                                                        // true

        // 문자열 비교 심화
        s1 = "1234";
        s2 = "1234";

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // true

        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false
    }
}
