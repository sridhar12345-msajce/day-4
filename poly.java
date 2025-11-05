class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing a square.");
    }
}

public class poly {
    public static void main(String[] args) {
        Shape s1 = new Circle();   // Upcasting
        Shape s2 = new Square();

        s1.draw();   // Circle version runs
        s2.draw();   // Square version ru}
    }}
