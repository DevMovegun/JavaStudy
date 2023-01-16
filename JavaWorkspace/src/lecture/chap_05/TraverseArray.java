package lecture.chap_05;

public class TraverseArray {

    public static void main(String[] args) {

        String[] coffees = new String[] {"아메리카노", "라떼", "에스프레소", "카푸치노"};

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++)
            System.out.println(coffees[i]);

        // enhanced for (for-each) 반복문
        for (String coffee : coffees)
            System.out.println(coffees);

        System.out.println("-------------");

        // n차원 배열 순회
        String[][] seats = new String[][] {
                {"A1", "A2", "A3"},
                {"B1", "B2"},
                {"C1", "C2", "C3", "C4"}
        };

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

    }
}
