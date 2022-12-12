package Models.Services;
import Models.Circle;

import java.util.Comparator;
public class CircleAreaComparator implements Comparator<Circle>{
    @Override
    public double compare(Circle o1, Circle o2) {
        return o1.getArea() - o2.getArea();
    }
}
