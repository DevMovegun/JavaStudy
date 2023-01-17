package lecture.chap_06;

public class DefineAndCallMethod {

    // 기본 메소드 정의
    public static void sayHello() {
        System.out.println("안녕하세요 메소드 입니다.");
    }

    // parameter 가 있는 메소드 정의
    public static void power(int number) { // number 는 Parameter (매개변수)
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
    }

    // parameter 가 2개 이상 있는 메소드 정의
    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "승은 " + result);
    }

    // return 값이 있는 메소드 정의
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }
    public static String getAddress() {
        return "서울시";
    }

    public static void main(String[] args) {
        sayHello();
        power(2); // 2는 Argument (인수)
        powerByExp(2, 4);

        String contactNumber = getPhoneNumber();
        String address = getAddress();
        System.out.println("전화번호 : " + contactNumber);
        System.out.println("주소 : " + address);
    }
}
