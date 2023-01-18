package lecture.chap_04;

public class _02_DoWhile {
    public static void main(String[] args) {

        int move = 0;
        int height = 25;

        do {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < 25);
        System.out.println("도착 했습니다");
        
    }
}
