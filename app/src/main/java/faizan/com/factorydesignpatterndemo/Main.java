package faizan.com.factorydesignpatterndemo;

/**
 * Created by buste on 5/1/2017.
 */

public class Main {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circleShape = shapeFactory.getShape("Circle");
        circleShape.draw();

        Shape rectangleShape = shapeFactory.getShape("Rectangle");
        rectangleShape.draw();

        Shape squareShape = shapeFactory.getShape("Square");
        squareShape.draw();
    }
}
