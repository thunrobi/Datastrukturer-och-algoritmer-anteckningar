import java.io.Serializable;

abstract class Vehicle implements Shoppable, Serializable {

    //vi deklarerar String-variabeln name
    private String name;
    private String type;
    private double price = 0.0;
    private double discount = 0.9;
    public Vehicle(String name, String type) {
        this.type = type;
        this.name = name;
    }

    public String soundWarning(){
        return "default sound";
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public double getPrice() {
        return price * discount;
    }
    public double getGrossPrice(){
        return price;
    }

    @Override
    public int getStock() {
        return 0;
    }

    public void setPrice(Double price) {
        if (price< 0) throw new RuntimeException("Bad Price!");
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
}
