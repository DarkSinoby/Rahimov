package ru.mirea.lab2.lab2ex3;
import ru.mirea.lab2.lab2ex3.Point;
import static java.lang.Math.sqrt;

public class Circle
{
    int a = 0;
    int b = 0;
    Point midpoint = new Point(a,b);

    private double x1;
    private double y1;
    private double r;

    public Circle(double x1, double x2)
    {
        this.x1 = x1;
        this.y1 = x2;
    }

    public Point getMidpoint()
    {
        return midpoint;
    }
    public double getX1()
    {
        return x1;
    }
    public double getY1()
    {
        return y1;
    }
    public double getR()
    {
        r = sqrt((x1 - 0)*(x1 - a) + (y1 - 0)*(y1 - b));
        return r;
    }

    public void setX1(double x1)
    {
        this.x1 = x1;
    }
    public void setY1(double y1)
    {
        this.y1 = y1;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "midpoint=" + midpoint +
                ", x1=" + x1 +
                ", y1=" + y1 +
                ", r=" + r +
                '}';
    }
}
