package Models.Services;

import java.util.List;

public class CircleAvarageComparator {
    @Override
    public double averageArea(List<Integer> area){
        return area.stream().mapToInt(x->x.intValue()).sum()/area.size();
    }
}
