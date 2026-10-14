public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public void printInfo() {
        System.out.printf("%s: площадь = %.2f, периметр = %.2f%n",
                name, getArea(), getPerimeter());
    }

    public String getName() {
        return name;
    }
}