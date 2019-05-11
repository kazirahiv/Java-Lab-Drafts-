public class Pizza extends FoodItem
{
    private String Size;
    public Pizza()
    { 
        Size = null;
    }

    public Pizza(String size, String name, double price)
    {
        super(price, name);
        this.Size = size;
    }

    public void setSize(String size)
    {
        this.Size = size;
    }

    public String getSize()
    {
        return this.Size;
    }
}