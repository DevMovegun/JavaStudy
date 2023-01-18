package lecture.chap_03;

public class _02_StringMethods {
    public static void main(String[] args) {

        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // " and" 를 "," 로 전부 변환
                                                                    // result : I like Java, Python, C.
        System.out.println(s.substring(7)); // index 기준 7(J) 부터 끝까지 출력
                                                    // result : Java and Python and C.
        System.out.println(s.substring(s.indexOf("I"), 11)); // parameter 를 2개 적으면 index 기준 첫번째 parameter 부터 (두번째 parameter - 1) 자리까지 출력
                                                // result : I like Java
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // Java and Python and C

        // 공백 제거
        s = "       I love Java.          ";

        System.out.println(s); //        I love Java.
        System.out.println(s.trim()); // I love Java.

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + ", " + s2); // Java, Python
        System.out.println(s1.concat(", ").concat(s2)); // Java, Python

    }
}
