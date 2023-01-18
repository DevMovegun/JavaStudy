package lecture.chap_07.camera;

// SpeedCamera is a Camera (IS-A)
public class SpeedCamera extends Camera { // 자식 클래스
    public SpeedCamera() {
//        this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeCarNumber() {
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override
    public void showMainPicture(){
        System.out.println(this.name + "의 주요 기능 : 속도 체크, 차량 번호 인식");
    }

    @Override
    public void takePicture() {
        // 사진 촬영
        super.takePicture();
        checkSpeed();
        recognizeCarNumber();
    }

}
