package lecture.chap_06;

public class MethodOverloading {
    public static int getPower(int number) {
        // return number * number // 원형
        return getPower(number, 2); // 메소드 내에서 오버로딩된 메소드를 호출 할 수 있음.
    }

    public static int getPower(String strNumber) {
        /*int number = Integer.parseInt(strNumber);
        return number * number;*/ // 원형
        return getPower(Integer.parseInt(strNumber), 2); // 메소드 내에서 오버로딩된 메소드를 호출 할 수 있음.
    }

    public static int getPower(int number, int exponent) {

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }

        return result;

    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        System.out.println(getPower(3)); // 기본형
        System.out.println(getPower("4")); // 전달값의 타입이 다름
        System.out.println(getPower(3, 3)); // 전달값의 갯수가 다름
    }
}
