package Models.Services;

import Models.Circle;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CircleServices {
    public void sortCircleByRadiusDescending(List<Circle> circles){
        circles.sort(new ComparatorCircle());
    }

    public void sortCircleByRadius(List<Circle> circles){
        circles.sort(new ComparatorCircle());
        Collections.reverse(circles);
    }

    public void sortCircle(List<Circle> circles){
        circles.sort(new Comparator<Circle>(){
                @Override
                public int compare(Circle o1, Circle o2){ return (int) (o1.getRadius() - o2.getRadius()); }
        });
    }
}
