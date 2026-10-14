public class Hexagon extends Shape {
    private double side;

    public Hexagon(double side) {
        super("Правильный шестиугольник");
        if (side <= 0) throw new IllegalArgumentException("Сторона должна быть > 0");
        this.side = side;
    }

    @Override
    public double getArea() {
        return (3 * Math.sqrt(3) / 2) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 6 * side;
    }
}