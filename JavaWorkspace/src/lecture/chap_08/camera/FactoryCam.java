package lecture.chap_08.camera;

import lecture.chap_08.detector.Detectable;
import lecture.chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {

    private Detectable detector;
    private Reportable reportor;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReportor(Reportable reportor) {
        this.reportor = reportor;
    }

    // 부모 추상 메서드 오버라이딩
    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reportor.report();
    }

    // SpeedCam class 와 중복이 됨
    /*public void detect() {
        System.out.println("화재를 감지합니다");
    }

    public void report() {
        System.out.println("화재 신고를 진행합니다.");
    }*/
}
