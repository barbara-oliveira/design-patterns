package com.br.exemplo.nullobject.dzone;

public interface Shape {
    double area();
    double perimeter();
    void draw();
    //É bom ter mátodos que indicam se o objeto é nulo
    boolean isNull();
}
