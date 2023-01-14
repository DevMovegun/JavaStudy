package quiz.practice;

public class Quiz_02 {
    public static void main(String[] args) {

        // 키 제한 변수
        int limit = 120;

        // 어린이의 키 변수
        int child01 = 115;
        int child02 = 121;

        // 탑승 여부 변수
        boolean pass01 = (limit <= child01) ? true : false;
        boolean pass02 = (limit <= child02) ? true : false;;

        // 실행 결과
        System.out.println("키가 " + child01 + " 이므로 탑승 " + ((pass01) ? "가능" : "불가능") + "합니다");
        System.out.println("키가 " + child02 + " 이므로 탑승 " + ((pass02) ? "가능" : "불가능") + "합니다");

    }
}
