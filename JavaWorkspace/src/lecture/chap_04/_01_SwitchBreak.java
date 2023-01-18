package lecture.chap_04;

public class _01_SwitchBreak {
    public static void main(String[] args) {
        
        // case 조건은 나눠야 하지만, 해당 동작이 중복이 될 때 예시
        int rank = 1;

        switch (rank) {
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2 : // 조건이 2일때와 3일때 동작이 같으므로 case 2 는 조건만 달아놓고 바로 case 3 으로 넘기면 됨
            case 3 :
                System.out.println("반액 장학금");
                break;
            default :
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료");

        // break 를 쓸 필요 없을 때 예시
        // 1등급은 3천원 추가, 2등급은 2천원 추가, 3등급은 1천원 추가, 그 외에는 추가 안함
        int grade = 1;
        int price = 7000;

        switch (grade) {
            case 1 :
                price += 1000;
            case 2 :
                price += 1000;
            case 3 :
                price += 1000;
                break;
        }
        System.out.println(price);
    }
}
