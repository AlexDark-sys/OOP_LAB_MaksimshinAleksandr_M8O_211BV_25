// Файл: Main.java
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 4, 5),
                new Trapezoid(10, 6, 5, 5, 4),
                new Hexagon(3)
        };

        for (Shape shape : shapes) {
            shape.printInfo();
        }
    }
}