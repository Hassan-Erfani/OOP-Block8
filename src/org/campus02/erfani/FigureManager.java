package org.campus02.erfani;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

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
    public HashMap<String, Double> getAreaBySizeCategories() {
        HashMap<String, Double> res = new HashMap<>();
        res.put("Klein", 0.0);
        res.put("Mittel", 0.0);
        res.put("Groß", 0.0);

        for (Figure figur : figuren) {

            if (figur.getArea() < 1000) {
                res.put("Klein", res.get("Klein") + figur.getArea());
            } else if (figur.getArea() < 5000 ) {
                res.put("Mittel", res.get("Mittel") + figur.getArea());
            } else {
                res.put("Groß", res.get("Groß") + figur.getArea());
            }
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FigureManager that = (FigureManager) o;
        return Objects.equals(figuren, that.figuren);
    }

    @Override
    public int hashCode() {
        return Objects.hash(figuren);
    }
}

