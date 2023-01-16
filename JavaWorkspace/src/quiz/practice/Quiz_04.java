package quiz.practice;

public class Quiz_04 {
    public static void main(String[] args) {

        // 주차요금
        int pricePerHour = 4000; // 시간당 주차요금
        int maxPricePerDay = 30000; // 일일 최대 주차요금
        int resultPrice; // 최종 주차요금

        // 경차 또는 장애인 차량 50% 할인
        double discount = 0.5;

        // 이용자 정보
        int parkingHour = 5; // 주차한 시간
        String carKind = "경차"; // 차량 종류

        resultPrice = parkingHour * pricePerHour; // 주차한 시간당 요금 부과

        if(resultPrice > maxPricePerDay) // 최종 주차요금이 일일 최대 주차요금을 넘으면 최종 주차요금을 일일 최대 주차요금으로 변경
            resultPrice = maxPricePerDay;

        switch (carKind) { // 차량 종류에 따라 할인
            case "경차" :
            case "장애인" :
                resultPrice *= discount;
        }

        System.out.println("주차 요금은 " + resultPrice + " 원 입니다.");

    }
}
