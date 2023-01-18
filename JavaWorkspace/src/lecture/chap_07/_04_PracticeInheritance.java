package lecture.chap_07;

// package lecture.chap_07.camera 참조

import lecture.chap_07.camera.*;

public class _04_PracticeInheritance {
    public static void main(String[] args) {
        // 상속
        Camera camera = new Camera();
        FactoryCamera factoryCamera = new FactoryCamera();
        SpeedCamera speedCamera = new SpeedCamera();

        System.out.println("-----------------------");

        System.out.println(camera.name);
        System.out.println(factoryCamera.name);
        System.out.println(speedCamera.name);

        System.out.println("-----------------------");

        // 상속 받으면 부모 클래스에 있는 instance 들을 사용할 수 있음
        camera.takePicture();
        factoryCamera.recordVideo();
        speedCamera.takePicture();

        System.out.println("-----------------------");

        // 자식 클래스의 새로운 기능
        factoryCamera.detectFire();
        speedCamera.checkSpeed();
        speedCamera.recognizeCarNumber();

        System.out.println("-----------------------");

        // 메소드 오버라이딩
        camera.showMainPicture();
        factoryCamera.showMainPicture();
        speedCamera.showMainPicture();

        System.out.println("-----------------------");

        // super
        factoryCamera.recordVideo();
        speedCamera.takePicture();

    }
}
