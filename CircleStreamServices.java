package Models.Services;

import Models.Circle;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CircleStreamServices {
    public void sortCircleByRadiusDescending(List<Circle> circles){
        circles.sort(Comparator.comparing(x->x.getRadius()));
    }

    public void sortCircleByRadius(List<Circle> circles){
        circles.sort(Comparator.comparing(x->x.getRadius()));
        Collections.reverse(circles);
    }

    public void sortCircle(List<Circle> circles){
        circles.sort((o1, o2) -> (int) (o1.getRadius() - o2.getRadius()));
    }
}

