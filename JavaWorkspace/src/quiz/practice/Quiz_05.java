package quiz.practice;

public class Quiz_05 {
    public static void main(String[] args) {
        // 신발 사이즈 재고 배열 선언
        int[] shoes = new int[10];

        // 재고 초기화
        for (int i = 0; i < shoes.length; i++) {
            shoes[i] = 250 + (i * 5);
        }

        // 재고 출력
        for (int size: shoes) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
