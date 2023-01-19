package lecture.chap_08;

import lecture.chap_08.camera.Camera;
import lecture.chap_08.camera.FactoryCam;
import lecture.chap_08.camera.SpeedCam;

public class _01_AbstractClass {

    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 추상 메소드 (추상 클래스에서만 사용 가능한, 껍데기만 있는 메소드)

//    Camera cam = new Camera(); Camera 는 추상 메소드 이므로 객체 생성 불가
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        Camera speedCam = new SpeedCam(); // 상속받은 자식 클래스로는 객체 생성 가능
        speedCam.showMainFeature();

    }

}
