package lecture.chap_07;

// 블랙박스 class
public class BlackBox {
    String modelName; // 모델명
    int price; // 가격
    int serialNumber; // 제품 시리얼 넘버
    static boolean canAutoReport = false; // 자동 신고 기능 개발 상태, class 변수
    static int count = 0; // class 변수
    static boolean nothingMean = false; // class 변수

    // 생성자
    BlackBox() {
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++count;
    }

    BlackBox(String modelName, int price) {
        this(); // 기본 생성자 호출
        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.price = price;
    }

    void autoReport() {
        if(canAutoReport) {
            System.out.println("기능 개발 완료");
        }
        else {
            System.out.println("기능 개발 미완료");
        }
    }
    
    static void callServiceCenter() { // class method
        System.out.println("서비스 센터 158-0508 로 연결합니다.");
//        modelName = test; // 사용 불가
        nothingMean = true; // 사용 가능
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
    }
}
