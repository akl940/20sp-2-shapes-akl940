public class Circle extends Shape
{
    private double radius;

    Circle(ShapeDescription sd)
    {
        super(sd);
        radius = sd.getDoubles().elementAt(0);
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    public double getPerimeter()
    {
        return Math.PI * (2*radius);
    }
}