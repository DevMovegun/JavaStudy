package lecture.chap_07;

import java.util.Random;

public class StudyClassWithWhiteBox {

    // WhiteBox.java 참조

    public static void main(String[] args) {
        WhiteBox w1 = new WhiteBox();
        w1.modelName = "까망이";
        // w1.price = 20000; // private 변수이므로 접근이 불가하므로 setter 활용
        w1.setPrice(2000);

        System.out.println(w1.modelName);
//        System.out.println(w1.price); // private 변수이므로 접근이 불가하므로 getter 활용
        System.out.println(w1.getPrice());
    }
}
