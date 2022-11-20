package Models;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FigureTest {

    @Test public void validCircle() {

        double radius = 4;
        double area = Math.PI * radius * radius;
        Circle circle = new Circle.Builder()
                .withRadius(radius)
                .withArea()
                .build();
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(circle.getRadius()).isEqualTo(radius);
        softAssertions.assertThat(circle.getArea()).isEqualTo(area);
                        softAssertions.assertAll();

    }

    @Test public void validTriangle() {

        double sideA = 4;
        double sideB = 5;
        double sideC = 3;
        double p = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        Triangle triangle = new Triangle.Builder()
                .withSideA(sideA)
                .withSideB(sideB)
                .withSideC(sideC)
                .withArea()
                .build();
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(triangle.getSideA()).isEqualTo(sideA);
        softAssertions.assertThat(triangle.getSideB()).isEqualTo(sideB);
        softAssertions.assertThat(triangle.getSideC()).isEqualTo(sideC);
        softAssertions.assertThat(triangle.getArea()).isEqualTo(area);
        softAssertions.assertAll();

    }

    @Test public void validRectangle() {

        double width = 3;
        double height = 3;
        double area = width * height;
        Rectangle rectangle = new Rectangle.Builder()
                .withWidth(width)
                .withHeight(height)
                .withArea()
                .build();
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(rectangle.getWidth()).isEqualTo(width);
        softAssertions.assertThat(rectangle.getHeight()).isEqualTo(height);
        softAssertions.assertThat(rectangle.getArea()).isEqualTo(area);
        softAssertions.assertAll();

    }

}
