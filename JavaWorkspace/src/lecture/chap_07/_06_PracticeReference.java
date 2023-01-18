package lecture.chap_07;

import lecture.chap_07.camera.Camera;

public class _06_PracticeReference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 (Primitive Data Types) : int, float, double, long, boolean ...
        int[] i = new int[3];
        System.out.println(i[0]); // 0

        boolean[] bl = new boolean[3];
        System.out.println(bl[0]); // false

        // 참조 자료형 (Non-Primitive, Reference Data Types) : String, Camera, FactoryCamera ...
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true

        System.out.println("-----------------------");

        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name); // 카메라1
        System.out.println(c2.name); // 카메라2
        c2 = c1;
        System.out.println(c1.name); // 카메라1
        System.out.println(c2.name); // 카메라1
        c2.name = "고장난 카메라";
        System.out.println(c1.name); // 고장난 카메라
        System.out.println(c2.name); // 고장난 카메라
    }
}
