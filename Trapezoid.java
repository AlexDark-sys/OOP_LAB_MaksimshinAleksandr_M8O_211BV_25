public class Trapezoid extends Shape {
    private double baseA;
    private double baseB;
    private double sideC;
    private double sideD;
    private double height;

    public Trapezoid(double baseA, double baseB, double sideC, double sideD, double height) {
        super("Трапеция");
        if (baseA <= 0 || baseB <= 0 || sideC <= 0 || sideD <= 0 || height <= 0)
            throw new IllegalArgumentException("Все параметры должны быть > 0");
        this.baseA = baseA;
        this.baseB = baseB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (baseA + baseB) / 2.0 * height;
    }

    @Override
    public double getPerimeter() {
        return baseA + baseB + sideC + sideD;
    }
}