package lecture.chap_07;

public class _01_StudyClassWithBlackBox {

    // BlackBox.java 참조

    public static void main(String[] args) {

        // BlackBox 클래스로부터 b1, b2 객체 생성
        // b1, b2 객체는 BlackBox 클래스의 instance
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.price = 20000;

        System.out.println(b1.modelName);
        System.out.println(b1.price);
        System.out.println(b1.serialNumber);

        System.out.println("-------------------");

        BlackBox b2 = new BlackBox("하양이", 20000); // 오버로딩 된 생성자

        System.out.println(b2.modelName);
        System.out.println(b2.price);
        System.out.println(b2.serialNumber);

        System.out.println("-------------------");

        // 특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        /* class 변수 사용시 권장되지 않는 방식
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        */
        System.out.println(" - 개발 전 - ");
        b1.autoReport();
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        // 기능 개발
        BlackBox.canAutoReport = true; // 모든 객체의 canAutoReport 가 저장하고 있는 값이 전부 true 로 변경됨

        // 기능 개발 후
        System.out.println(" - 개발 후 - ");
        b1.autoReport();
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        System.out.println("-------------------");

        // class method
        BlackBox.callServiceCenter();

        System.out.println("-------------------");

        // this
        b1.appendModelName("(최신형)");
        System.out.println(b1.modelName);
    }
}
