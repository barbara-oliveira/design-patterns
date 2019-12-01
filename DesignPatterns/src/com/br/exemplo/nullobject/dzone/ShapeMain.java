package com.br.exemplo.nullobject.dzone;

public class ShapeMain {
    public static void main(String args[]){
        String[] shapeTypes = new String[] {"Circle", null, "Triangle", "Pentagon", "Rectangle"};
        for (String shapeType : shapeTypes){
            Shape shape = ShapeFactory.createShape(shapeType);
            System.out.println("Shape area: "+shape.area());
            System.out.println("Shape perimeter: "+shape.perimeter());
            shape.draw();
            System.out.printf("");
        }
    }
}
