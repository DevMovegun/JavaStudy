package lecture.chap_07;

import java.util.Random;

public class _03_PracticeRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("랜덤 정수 : " + rand.nextInt()); // int 의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 (범위 : " + rand.nextInt(10)); // 0이상 10미만의 정수형 값
        System.out.println("랜덤 실수 : " + rand.nextDouble()); // 0.0이상 1.0 미만의 실수 값

//        System.out.println("랜덤 실수 : " + rand.nextDouble(10.0)); // double 은 값을 지정할 수 없음
        // 5.0 이상 10.0 미만의 실수를 뽑으려면
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + (max - min) * rand.nextDouble()));

        // Math, Scanner, StingBuilder, StringBuffer, StringTokenizer
        // BigInteger, BigDecimal
        // LocalDate, LocalTime, LocalDateTime, DateTimeFormatter, ...

    }
}
