package lecture.chap_07;

import lecture.chap_07.camera.Camera;
import lecture.chap_07.camera.FactoryCamera;
import lecture.chap_07.camera.SpeedCamera;

public class PracticePolymorphism {
    public static void main(String[] args) {
        // 다형성

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCamera();
//        FactoryCamera factoryCam1 = new Camera(); // 역은 안됨
        Camera speedCam = new SpeedCamera();

        camera.showMainPicture();
        factoryCam.showMainPicture();
        speedCam.showMainPicture();

        System.out.println("-----------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCamera();
        cameras[2] = new SpeedCamera();

        for (Camera cam : cameras) {
            cam.showMainPicture();
        }

        System.out.println("-----------------------");

//        factoryCam.detectFire();
//        speedCam.checkSpeed();

        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }

        if (factoryCam instanceof FactoryCamera) {
            ((FactoryCamera) factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCamera) {
            ((SpeedCamera) speedCam).checkSpeed();
        }

        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[0] = new FactoryCamera();
        objs[0] = new SpeedCamera();

    }
}
