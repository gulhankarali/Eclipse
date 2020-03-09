package Repl;

class Toy {
    double price;
    String color;
    Toy(String color, double price) {
        this.color = color;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String getColor() {
        return color;
    }
}