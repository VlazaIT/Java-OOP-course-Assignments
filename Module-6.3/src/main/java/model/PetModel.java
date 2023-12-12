package model;

public class PetModel {
    private double x;
    private double y;

    public PetModel(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
