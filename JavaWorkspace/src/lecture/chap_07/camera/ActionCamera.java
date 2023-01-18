package lecture.chap_07.camera;

public final class ActionCamera extends Camera {
    public final String lens; // "광각렌즈"; // 같은 class 내에서건 어디에서건 lens 의 값은 변경할 수 없음
    public ActionCamera() {
        this("액션 카메라");
    }

    public ActionCamera(String name) {
        super(name);
        lens = "광곽렌즈";
    }

    public final void makeVideo() { // 자식 클래스에서 오버라이딩 자체가 불가능해짐
        System.out.println(this.name + " : " + this.lens + "로 멋진 비디오를 제작합니다.");
    }
}
