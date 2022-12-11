package Models;

import java.util.Objects;

public class Rectangle extends Figure {
    private static final String NAME = "Rectangle";

    private double width;
    private double height;
    private double area;

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString(){
        return "Circle{" +
                "Width='" + width + '\'' +
                "Height='" + height + '\'' +
                ", Area='" + getArea() + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(width, rectangle.width) && Objects.equals(height, rectangle.height);
    }
    @Override
    public int hashCode() { return Objects.hash(width, height); }

    public static class Builder{
        private Rectangle newRectangle;

        public Builder(){ newRectangle = new Rectangle(); }

        public Rectangle.Builder withWidth(Double width){
            newRectangle.width = width;
            return this;
        }

        public Rectangle.Builder withHeight(Double height){
            newRectangle.height = height;
            return this;
        }

        public Rectangle.Builder withArea(){
            newRectangle.area = build().getArea();
            return this;
        }

        public Rectangle build(){
            validate(newRectangle);
            return newRectangle;
        }
    }
    public static void validate(Rectangle newRectangle){
        String error = "";
        if(newRectangle.width < 0 || newRectangle.width == 0){
            error+="\nWidth cannot be 0 or a negative value";
        }
        if(newRectangle.height < 0 || newRectangle.height == 0){
            error+="\nHeight cannot be 0 or a negative value";
        }
        if (!error.isEmpty()){
            throw new IllegalArgumentException(error);
        }
    }
}