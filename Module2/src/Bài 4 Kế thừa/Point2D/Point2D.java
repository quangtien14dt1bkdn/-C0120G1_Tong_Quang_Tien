package baitap.Point2D;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] array = new float[]{this.getX(), this.getY()};
        return array;
    }

    public String toString() {
        return "Point2D{x=" + this.x + ", y=" + this.y + "}";
    }
}
