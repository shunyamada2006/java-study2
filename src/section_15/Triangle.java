package section_15;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
        if((this.side1+this.side2<=this.side3)||(this.side2+this.side3<=this.side1)||(this.side1+this.side3<=this.side2)){
            throw new IllegalArgumentException("三角形ではありません");
        }
        return area;
    }
}