package lecture.chap_03;

public class EscapeSequence {
    public static void main(String[] args) {
        
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");
        // 자바가
        // 너무
        // 재밌어요

        // \t : 탭
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        // 해물파전	9000원
        // 김치전	8000원

        // \\ : 역슬래시
        System.out.println("C:\\Program Files\\Java");
        // C:\Program Files\Java

        // \" : 큰 따옴표
        // \' : 작은 따옴표
        System.out.println("\"단비가 '냐옹' 이라고 했어요.\""); // 문자열에 작은 따옴표는 그냥 써도 됨
        // "단비가 '냐옹' 이라고 했어요."
        char ch = '\'';
        System.out.println(ch);

    }
}
