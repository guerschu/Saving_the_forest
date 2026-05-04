
public class Items{

    private String name;
    private double price;
    private int healthCover;
    private boolean trade;
    private String description;

    
    public void Item(String name, double price, int healthCover, boolean trade, String description) {
        this.name = name;
        this.price = price;
        this.healthCover = healthCover;
        this.trade = trade;
        this.description = description;
    }

    public String getName(Items item){
        return item.name;
    }

    public double getPrice(Items item){
        return item.price;
    }

    public int getHealthCover(Items item){
        return item.healthCover;
    }

    public String getDescription(Items item){
        return item.description;
    }

    public boolean getTrade(Items item){
        return item.trade;
    }

    
}