package ru.mirea.lab2.lab2ex4;

public class Shop {
    private String stock;

    public Shop(String stock) {
        this.stock = stock;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "stock: '" + stock + '\'' +
                '}';
    }
}
