package model;
public class Product {
    private String name;
    private int purchasePrice;
    private int salePrice;
    private boolean isSold;

    public Product(String name, int purchasePrice, int salePrice) {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.isSold = false;
    }

    public int calculateProfit() {
        return salePrice - purchasePrice;
    }

    public void markAsSold() {
        isSold = true;
    }

    public boolean isSold() {
        return isSold;
    }

    public String getName() {
        return name;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getSalePrice() {
        return salePrice;
    }
}
