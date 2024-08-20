package structural_patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private final PointIconFactory pointIconFactory;

    public PointService(PointIconFactory factory) {
        this.pointIconFactory = factory;
    }

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        var point = new Point(1, 2, pointIconFactory.getPointIcon(PointType.CAFE));
        points.add(point);
        return points;
    }
}
