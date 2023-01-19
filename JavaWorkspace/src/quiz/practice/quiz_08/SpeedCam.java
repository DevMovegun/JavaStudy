package quiz.practice.quiz_08;

public class SpeedCam implements Detectable, Reportable {

    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
