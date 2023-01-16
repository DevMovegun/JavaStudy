package lecture.chap_05;

public class DefineArray {
    public static void main(String[] args) {

        // 1차원 배열 선언 방법
        // 첫번째 방법
        String[] array01 = new String[4];
        // 두번째 방법
        String array02[] = new String[4];

        // 1차원 배열 값 초기화 방법
        // 첫번째 방법
        String[] coffee01 = new String[4];
        coffee01[0] = "아메리카노";
        coffee01[1] = "카페모카";
        coffee01[2] = "라떼";
        coffee01[3] = "카푸치노";
        // 두번째 방법
        String[] coffee02 = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};
        // 세번째 방법
        String[] coffee03 = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 2차원 배열 선언 및 초기화
        String[][] seats = new String[][] {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3"},
                {"C1", "C2", "C3"}
        };

        String[][] seat = new String[][] {
                {"A1", "A2", "A3"},
                {"B1", "B2"},
                {"C1", "C2", "C3", "C4"}
        };

    }
}
