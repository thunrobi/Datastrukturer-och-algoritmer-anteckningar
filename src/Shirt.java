public class Shirt extends Clothing implements Shoppable {

    public Shirt(String brand, String color, Double price){
        super.brand = brand;
        super.color = color;
        super.price = price;
    }

    @Override
    void mend() {

    }

    @Override
    public int getStock() {
        return 0;
    }
}
