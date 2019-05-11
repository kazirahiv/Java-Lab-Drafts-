public class Course
{
    private String courseName;
    private float credit;
    private String typeOfCourse;
    public static int totalObjects=0; 

    Course()
    {
        this.courseName = "";
        this.credit = 0;
        this.typeOfCourse = "";
        totalObjects = totalObjects + 1;
    }


    public void setCourseName(String cname)
    {
        this.courseName = cname;
    }

    public void setCredit(float cr)
    {
        this.credit = cr;
    }

    public void setTypeOfCourse(String toc)
    {
        this.typeOfCourse = toc;
    }

    public String getCourseName()
    {
        return this.courseName;
    }

    public float getCredit()
    {
        return this.credit;
    }

    public String getTypeOfCourse()
    {
        return this.typeOfCourse;
    }
}