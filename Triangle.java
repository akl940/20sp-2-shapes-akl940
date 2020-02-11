public class Triangle extends Shape
{
    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(ShapeDescription sd)
    {
        super(sd);
        sideA = sd.getDoubles().elementAt(0);
        sideB = sd.getDoubles().elementAt(1);
        sideC = sd.getDoubles().elementAt(2);
    }

    public double getArea()
    {
        double s = getPerimeter()/2;
        double t = (s*(s-sideA)*(s-sideB)*(s-sideC));
        return Math.sqrt(t);
    }
    public double getPerimeter()
    {
        return sideA + sideB + sideC;
    }
}