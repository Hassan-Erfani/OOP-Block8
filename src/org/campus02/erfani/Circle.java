package org.campus02.erfani;

public class Circle extends Figure{
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getArea() {
        return Math.PI * Math.sqrt(radius);
    }
}
