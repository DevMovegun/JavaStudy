package lecture.chap_07.camera;

/* class 가 final 로 선언되어 상속을 할 수 없음
public class SlowActionCamera extends ActionCamera {
    public SlowActionCamera() {
        super("슬로우 액션 카메라");
    }

    *//* final method 라 오버라이딩 할 수 없음
    @Override
    public void makeVideo() {
        System.out.println(this.name + " : " + this.lens
                + "로 멋진 슬로우 비디오를 제작합니다.");
    }
    *//*
} */

public class SlowActionCamera extends Camera {
    public final String lens;

    public SlowActionCamera() {
        this("슬로우 액션 카메라");
    }

    public SlowActionCamera(String name) {
        super(name);
        lens = "광곽렌즈";
    }

    public final void makeVideo() { // 자식 클래스에서 오버라이딩 자체가 불가능해짐
        System.out.println(this.name + " : " + this.lens + "로 멋진 슬로우 비디오를 제작합니다.");
    }
}
