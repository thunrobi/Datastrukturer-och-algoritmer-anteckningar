public class Shirt extends Clothing {

    public Shirt(String brand, String color, Double price){
        super.brand = brand;
        super.color = color;
        super.setPrice(0.0);
    }

    @Override
    void mend() {

    }
}
