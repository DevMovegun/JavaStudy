package lecture.chap_07;

public class WhiteBox { // BlackBox class 의 문제점을

    public String modelName; // 모델명
    String resolution; // 해상도
    private int price; // 가격
    protected String color; // 색상

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        if(price < 10000) {
            setPrice(10000);
        }
        return price;
    }

    // Getter, Setter
    public void setPrice(int price) {
        this.price = price;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
