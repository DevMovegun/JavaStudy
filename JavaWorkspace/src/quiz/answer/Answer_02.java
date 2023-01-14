package quiz.answer;

public class Answer_02 {
    public static void main(String[] args) {
        // 키 제한 변수
        int heightLimit = 120;

        // 어린이의 키 변수
        int height01 = 115;
        int height02 = 121;

        // 탑승 여부 결과 저장 변수
        String result01 = (height01 >= heightLimit) ? "탑승 가능합니다" : "탑승 불가능합니다";
        String result02 = (height02 >= heightLimit) ? "탑승 가능합니다" : "탑승 불가능합니다";

        // 실행 결과
        System.out.println("키가 " + height01 + " 이므로 " + result01);
        System.out.println("키가 " + height02 + " 이므로 " + result02);
    }
}
