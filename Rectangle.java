public class Rectangle extends Shape
{
    private double height;
    private double width;

    Rectangle(ShapeDescription sd)
    {
        super(sd);
        height = sd.getDoubles().elementAt(0);
        width = sd.getDoubles().elementAt(1);
    }

    public double getArea()
    {
        return height * width;
    }
    public double getPerimeter()
    {
        return ((2 * height) + (2 * width));
    }
}