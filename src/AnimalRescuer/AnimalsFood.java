package AnimalRescuer;

public class AnimalsFood {

    private String name;
    private String price;
    private double quantityInGrams;
    private String stockAvailability;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getPrice(){
        return price;
    }
    public void setPrice(String price){
        this.price = price;
    }

    public double getQuantityInGrams(){
        return quantityInGrams;
    }
    public void setQuantityInGrams( double quantityInGrams){
        this.quantityInGrams = quantityInGrams;
    }

    public String getStockAvailability(){
        return stockAvailability;
    }
    public void setStockAvailability(String stockAvailability){
        this.stockAvailability = stockAvailability;
    }
}
