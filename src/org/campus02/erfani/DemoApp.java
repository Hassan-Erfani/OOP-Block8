package org.campus02.erfani;

public class DemoApp {
    public static void main(String[] args) {
        Figure r1 = new Rectangle(30, 20); // Area: 600 Perimeter: 100
        Figure r2 = new Rectangle(33, 20); // Area: 660 Perimeter: 106
        Figure r3 = new Rectangle(65, 40); // Area: 2600 Perimeter: 210
        Figure r4 = new Rectangle(70, 50); // Area: 3500 Perimeter: 240
        Figure r5 = new Rectangle(100, 60); // Area: 6000 Perimeter: 320
        Figure r6 = new Rectangle(100, 80); // Area: 8000 Perimeter: 360

        Figure c1 = new Circle(15); // Area: 706 Perimeter: 94
        Figure c2 = new Circle(20); // Area: 1256 Perimeter: 125
        Figure c3 = new Circle(50); // Area: 7853 Perimeter: 314


        FigureManager figure = new FigureManager();

       figure.add(r1);
       figure.add(r2);
       figure.add(r3);
       figure.add(r4);
       figure.add(r5);
       figure.add(r6);
       figure.add(c1);
       figure.add(c2);
       figure.add(c3);

       System.out.println(figure.getMaxPerimeter());
       System.out.println(figure.getAverageAreaSize());
    }
}
