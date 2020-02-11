public class Square extends Shape
{
    private double sideLength;

    Square(ShapeDescription sd)
    {
        super(sd);
        sideLength = sd.getDoubles().elementAt(0);
    }
    
    public double getArea()
    {
        return sideLength * sideLength;
    }
    public double getPerimeter()
    {
        return sideLength * 4.0;
    }

}