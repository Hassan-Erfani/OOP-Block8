package org.campus02.erfani;

import java.util.ArrayList;

public class FigureManager {
    private ArrayList<Figure> figuren = new ArrayList<>();

    public void add(Figure f) {
        figuren.add(f);
    }

    public double getMaxPerimeter() {
        double res = 0;
        for (Figure figure : figuren) {
            double perimeter = figure.getPerimeter();
            if (perimeter > res) {
                res = perimeter;
            }
        }
        return res;
    }

    public double getAverageAreaSize() {
        double res = 0;
        for (int i = 0; i < figuren.size(); i++) {
            res += figuren.get(i).getArea();
        }
        return res / figuren.size();
    }

    // TODO: getAreaBySizeCategories() => Hashmap
}

