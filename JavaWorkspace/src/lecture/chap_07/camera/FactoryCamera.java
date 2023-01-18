package lecture.chap_07.camera;

// FactoryCamera is a Camera (IS-A)
public class FactoryCamera extends Camera { // 자식 클래스
    public FactoryCamera() {
//        this.name = "공장 카메라";
        super("공장 카메라");
    }

    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    // 메소드 오버라이딩
    @Override
    public void showMainPicture(){
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }

    @Override
    public void recordVideo() {
        // 동영상 녹화
        super.recordVideo(); // 부모 class 의 recordVideo() 실행
        detectFire();
    }
}
