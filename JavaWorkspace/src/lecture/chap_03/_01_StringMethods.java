package lecture.chap_03;

public class _01_StringMethods {
    public static void main(String[] args) {

        String s = "I like Java and Python and C";

        // 문자열의 길이
        System.out.println(s.length()); // 28
        
        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 전부 대문자로
        System.out.println(s.toLowerCase()); // 전부 소문자로

        // 포함 관계 : 포함되면 true 포함되지 않는다면 false 반환
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("C#")); // false

        // 위치 정보 반환 : 시작을 0으로 계산하여 반환 일치하는 index 가 없으면 -1 반환
        System.out.println(s.indexOf("Java")); // 7
        System.out.println(s.indexOf("C#")); // -1
        // 위치 정보를 찾는 문자열이 중복일 경우
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치 정보 반환 result : 12
        System.out.println(s.lastIndexOf("and")); // 마지막으로 일치하는 위치 정보 반환 result : 23

        // 특정 문자열로 시작하거나 끝나는지 확인할 때 맞으면 true, 틀리면 false 반환
        System.out.println(s.startsWith("I like")); // 특정 문자열로 시작하는지 확인 result : true
        System.out.println(s.endsWith(".")); // 특정 문자열로 끝나는지 확인 result : false
    }
}
