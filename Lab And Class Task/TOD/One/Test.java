public class Test
{
    public static void main(String[] args)
    {
        Course obj1 = new Course();
        Course obj2 = new Course();
        obj1.setCourseName("ECONOMICS");
        obj1.setCredit(3.0);
        obj1.setTypeOfCourse("THEORY");
        
        obj2.setCourseName("PHYSICS1");
        obj2.setCredit(1.0);
        obj2.setTypeOfCourse("THEORY");

        System.out.println(obj1.getCourseName() +"with credit "+ obj1.getCredit()+ " is a "+ obj1.getTypeOfCourse()+" course");
        System.out.println(obj2.getCourseName() +"with credit "+ obj2.getCredit()+ " is a "+ obj2.getTypeOfCourse()+" course");
    }
}