package faizan.com.factorydesignpatterndemo;

/**
 * Created by buste on 5/1/2017.
 */

public class ShapeFactory {

    public Shape getShape(String type) {
        if(type.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if(type.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else if(type.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}