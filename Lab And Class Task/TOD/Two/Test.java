public class Test
{
    public static void main(String[] args)
    {
        Rectangle[] rarray = new Rectangle[2];
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        public int avg =0;
        rect1.setX(200);
        rect1.setY(100);
        rect2.setX(200);
        rect2.setY(300);
        rarray[0] = rect1;
        rarray[1] = rect2;
        for(i=0; i<2; i++)
        {
            avg = avg+ rarray[i].getArea();
        }
        System.out.println("Average area -"+ avg/2);

        for(i=0; i<2; i++)
        {
            if(rarray[i].getY() > 100)
            {
                System.out.println("Greate Rect No -"+ i);
            }
        }
    }
}