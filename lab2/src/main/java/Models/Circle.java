package Models;

import java.util.Objects;

public class Circle extends Figure {
    private static final String NAME = "Circle";

    private double radius;
    private double area;
    @Override
    public double getArea(){
         return area = Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Circle{" +
                "Radius='" + radius + '\'' +
                ", Area='" + getArea() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Circle circle = (Circle) o;
        return Objects.equals(radius, circle.radius);
    }
    @Override
    public int hashCode() { return Objects.hash(radius); }

    public static class Builder{
        private Circle newCircle;

        public Builder(){ newCircle = new Circle(); }

        public Builder withRadius(Double radius){
            newCircle.radius = radius;
            return this;
        }

        public Builder withArea(){
            newCircle.area = build().getArea();
            return this;
        }

        public Circle build(){ return newCircle; }
    }
}