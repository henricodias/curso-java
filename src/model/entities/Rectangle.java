package model.entities;

import model.entities.enums.Color;

public class Rectangle extends Shape {

    private Double width;
    private Double heith;

    public Rectangle(Color color) {
        super(color);
    }

    public Rectangle(Color color, Double width, Double heith) {
        super(color);
        this.width = width;
        this.heith = heith;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeith() {
        return heith;
    }

    public void setHeith(Double heith) {
        this.heith = heith;
    }

    @Override
    public double area() {
        return width * heith;
    }
}