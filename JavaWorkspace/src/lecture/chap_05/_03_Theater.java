package lecture.chap_05;

public class _03_Theater {
    public static void main(String[] args) {

        // 세로 10 x 가로 15 에 해당하는 영화관 좌석
        String[][] theater = new String[10][15];
        char seat = 'A'; // ASCII 코드

        // 좌석 번호 초기화
        for (int i = 0; i < theater.length; i++) {
            for (int j = 0; j < theater[i].length; j++) {
                theater[i][j] = String.valueOf(seat) + (j + 1);
            }
            seat++;
        }

        // 배열 출력
        for (int i = 0; i < theater.length; i++) {
            for (int j = 0; j < theater[i].length; j++) {
                System.out.print(theater[i][j] + " ");
            }
            System.out.println();
        }

    }
}
