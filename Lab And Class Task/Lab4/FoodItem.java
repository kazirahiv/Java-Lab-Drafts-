public class FoodItem
{
    private double price;
    private String name;

    public FoodItem()
    {
        price = 0;
        name = null;
    }

    public FoodItem(double price, String name)
    {
        this.price = price;
        this.name = name;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return this.price;
    }
    public String getName(String name)
    {
        return this.name;
    }


    public void showDetails()
    {
        System.out.println("Food Price -"+ this.price);
        System.out.println("Food Name -"+ this.name);
    }
}