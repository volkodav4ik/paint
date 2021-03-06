package sample.paint.model;

import sample.paint.Board;
import sample.paint.DisplayDriver;

public class Triangle extends AbstractShape {

    public Triangle(DisplayDriver driver, Board board, int x, int y, int size) {
        super(driver, board, x, y, size);
    }

    @Override
    public void draw() {
        driver.drawTriangle(x, y, size, active);
    }

    @Override
    public Shape copy() {
        return new Triangle(driver, board, x, y, size);
    }


}
