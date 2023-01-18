package lecture.chap_07_01;

// package 가 다른 경우를 실험하기 위한 클래스

import lecture.chap_07.*; // lecture.chap_07 에 있는 모든 클래스 사용 가능
//import lecture.chap_07.WhiteBox;
public class AccessModifierTest {
    public static void main(String[] args) {
        WhiteBox w1 = new WhiteBox();
        w1.modelName = "까망이"; // public
//        w1.resolution = "FHD"; // default 접근 불가
//        w1.price = 20000; // private 접근 불가
//        w1.color = "블랙"; // protected 접근 불가

        BlackBox b1;
    }
}
