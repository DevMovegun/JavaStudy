package lecture.chap_07;

public class PracticeEnum {
    public static void main(String[] args) {
        // 열거형 (Enum)
        // 달력 : 1월, 2월, 3월 ..
        // 옷 사이즈 : S, M, L, XL ...
        // OS 종류 : WIN10, MACOS, LINUX ..

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);
        resolution = resolution.FHD;
        System.out.println(resolution);

        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("최고화질");
                break;
        }

        resolution = Resolution.valueOf("FHD");
        System.out.println(resolution);

        System.out.println("-----------------------");

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.ordinal());
        }

        System.out.println("-----------------------");
        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }
    }
}

enum Resolution {

    // HD, FHD, UHD 하고 세미콜론 없이 class 끝내도 됨
    HD(1280), FHD(1920), UHD(3480);

    private final int width;
    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
