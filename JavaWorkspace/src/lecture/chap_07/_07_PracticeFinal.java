package lecture.chap_07;

import lecture.chap_07.camera.ActionCamera;
import lecture.chap_07.camera.SlowActionCamera;

public class _07_PracticeFinal {
    public static void main(String[] args) {
        // Final
        ActionCamera actionCamera = new ActionCamera();

//        actionCamera.lens = "표준렌즈"; // final 로 정의되어 바꿀 수 없음
        actionCamera.recordVideo();
        actionCamera.makeVideo();

        System.out.println("-----------------------");

        SlowActionCamera slowActionCamera = new SlowActionCamera();
        slowActionCamera.recordVideo();
        slowActionCamera.makeVideo();

    }
}
