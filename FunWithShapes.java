//import ShapeDescription.ShapeTypes;

public class FunWithShapes extends ShapeHandler
{
    public static void main(String args[])
    {
        try
        {
            FunWithShapes f = new FunWithShapes();
            double area = f.sumOverAreas();
            double perim = f.sumOverPerimeters();

            System.out.println(area);
            System.out.println(perim);
        }
        catch(ShapeException s)
        {
            System.out.println("ShapeException");
        }
    }

    FunWithShapes() throws ShapeException
    {
        super();
    }

    public void convertDescriptionsToShapes()
    {
        for(int i = 0; i < shapeDescriptions.size(); i++)
        {
            ShapeDescription sd = shapeDescriptions.elementAt(i);
           if(sd.getShapeType() == ShapeDescription.ShapeTypes.CIRCLE)
           {
               Circle c = new Circle(sd);
               shapes.add(c);
           }
           else if(sd.getShapeType() == ShapeDescription.ShapeTypes.SQUARE)
           {
               Square s = new Square(sd);
               shapes.add(s);
           }
           else if(sd.getShapeType() == ShapeDescription.ShapeTypes.RECTANGLE)
           {
               Rectangle r = new Rectangle(sd);
               shapes.add(r);
           }
           else if(sd.getShapeType() == ShapeDescription.ShapeTypes.TRIANGLE)
           {
               Triangle t = new Triangle(sd);
               shapes.add(t);
           }
        }
    }

    public double sumOverAreas()
    {
        double areaSum = 0.0;
        for(int i = 0; i < shapes.size(); i++)
        {
            areaSum += shapes.elementAt(i).getArea();
        }

        return areaSum;
    }

    public double sumOverPerimeters()
    {
        double perSum = 0.0;
        for(int i = 0; i < shapes.size(); i++)
        {
            perSum += shapes.elementAt(i).getPerimeter();
        }

        return perSum;
    }
}