package lecture.chap_08;

import lecture.chap_08.camera.FactoryCam;
import lecture.chap_08.detector.AdvancedFireDetector;
import lecture.chap_08.detector.Detectable;
import lecture.chap_08.detector.FireDetector;
import lecture.chap_08.reporter.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("-------------");

        FactoryCam factoryCamera = new FactoryCam();
        factoryCamera.setDetector(advancedFireDetector);
        factoryCamera.setReportor(videoReporter);

        factoryCamera.detect();
        factoryCamera.report();
    }
}