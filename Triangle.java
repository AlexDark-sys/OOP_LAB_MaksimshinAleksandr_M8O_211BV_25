public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        super("Треугольник");
        if (a <= 0 || b <= 0 || c <= 0)
            throw new IllegalArgumentException("Стороны должны быть > 0");
        if (a + b <= c || a + c <= b || b + c <= a)
            throw new IllegalArgumentException("Треугольник с такими сторонами не существует");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2; // полупериметр
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}