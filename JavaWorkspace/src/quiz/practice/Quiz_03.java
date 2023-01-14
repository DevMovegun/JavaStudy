package quiz.practice;

public class Quiz_03 {
    public static void main(String[] args) {

        // 생년월일과 뒷 7자리 숫자 변수
        int birthDate01 = 901231;
        int behindNum01 = 1234567;

        // 주민번호 변수
        String id01 = Integer.toString(birthDate01).concat("-").concat(Integer.toString(behindNum01));
        String id02 = "030708-4567890";

        // 성별을 나타내는 숫자의 index 를 기억하는 변수
        int sexIndex = id01.indexOf("-") + 1;

        // 생년월일 및 성별을 확인하는 주민번호까지 저장하는 변수
        String result01 = id01.substring(0, sexIndex + 1);
        String result02 = id02.substring(0, sexIndex + 1);

        // 결과 출력
        System.out.println(result01);
        System.out.println(result02);

    }
}
