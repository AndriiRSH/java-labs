package Models;

import java.util.Objects;

public class Triangle extends Figure {
    private static final String NAME = "Triangle";

    private double sideA;
    private double sideB;
    private double sideC;
    private double area;

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    @Override
    public String toString(){
        return "Circle{" +
                "sideA='" + sideA + '\'' +
                "sideB='" + sideB + '\'' +
                "sideC='" + sideC + '\'' +
                ", Area='" + getArea() + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(sideA, triangle.sideA) && Objects.equals(sideB, triangle.sideB) && Objects.equals(sideC, triangle.sideC);
    }
    @Override
    public int hashCode() { return Objects.hash(sideA, sideB, sideC); }

    public static class Builder{
        private Triangle newTriangle;

        public Builder(){ newTriangle = new Triangle(); }

        public Triangle.Builder withSideA(Double sideA){
            newTriangle.sideA = sideA;
            return this;
        }

        public Triangle.Builder withSideB(Double sideB){
            newTriangle.sideB = sideB;
            return this;
        }

        public Triangle.Builder withSideC(Double sideC){
            newTriangle.sideC = sideC;
            return this;
        }

        public Triangle.Builder withArea(){
            newTriangle.area = build().getArea();
            return this;
        }

        public Triangle build(){
            validate(newTriangle);
            return newTriangle;
        }
    }
    public static void validate(Triangle newTriangle){
        String error = "";
        if(newTriangle.sideA < 0 || newTriangle.sideA == 0){
            error+="\nsideA cannot be 0 or a negative value";
        }
        if(newTriangle.sideB < 0 || newTriangle.sideB == 0){
            error+="\nsideB cannot be 0 or a negative value";
        }
        if(newTriangle.sideC < 0 || newTriangle.sideC == 0){
            error+="\nsideC cannot be 0 or a negative value";
        }
        if (!error.isEmpty()){
            throw new IllegalArgumentException(error);
        }
    }
}