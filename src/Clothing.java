

abstract class Clothing {

    String brand;
    String color;
    Double price;
    int condition = 0;

    public String getColor() {
        return color;
    }
    public String getBrand() {
        return brand;
    }
    public Double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

   abstract void mend();
}
