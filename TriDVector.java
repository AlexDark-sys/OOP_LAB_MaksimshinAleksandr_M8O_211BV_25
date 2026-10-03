import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class TriDVector {
    static {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private double x;
    private double y;
    private double z;

    public TriDVector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void showInfo() {
        System.out.println("Вектор: (" + x + ", " + y + ", " + z + ")");
    }

    public double calculateMagnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public TriDVector add(TriDVector other) {
        return new TriDVector(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public TriDVector subtract(TriDVector other) {
        return new TriDVector(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public double scalProizv(TriDVector other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public TriDVector crossProduct(TriDVector other) {
        double crossX = this.y * other.z - this.z * other.y;
        double crossY = this.z * other.x - this.x * other.z;
        double crossZ = this.x * other.y - this.y * other.x;
        return new TriDVector(crossX, crossY, crossZ);
    }

    public static void main(String[] args) {
        TriDVector vector1 = new TriDVector(1.0, 2.0, 3.0);
        TriDVector vector2 = new TriDVector(4.0, 5.0, 6.0);

        vector1.showInfo();
        vector2.showInfo();

        System.out.println("Воектор1: " + vector1.calculateMagnitude());
        System.out.println("Вектор2: " + vector2.calculateMagnitude());

        TriDVector sum = vector1.add(vector2);
        sum.showInfo();

        TriDVector difference = vector1.subtract(vector2);
        difference.showInfo();

        double scalProizv = vector1.scalProizv(vector2);
        System.out.println("Скалярное произведение: " + scalProizv);

        TriDVector crossProduct = vector1.crossProduct(vector2);
        crossProduct.showInfo();
    }
}
