public class Rectangle
{
    private int x;
    private int y;
    

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int x)
    {
        this.y = y;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public void getArea()
    {
        return x*y;
    }
    public void showArea()
    {
        System.out.println("Area Is -"+ getArea());
    }
}