package Models.Services;

import Models.Circle;

import java.util.Comparator;

public class ComparatorCircle implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2){
        return o1.getRadius().compareTo((o2.getRadius()));
    }

}