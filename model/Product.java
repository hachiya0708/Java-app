package model;

//仕入れ商品
public class Product {
    //仕入れ商品名
    private String name;
    //仕入れ価格
    private int purchasePrice;
    //販売価格
    private int salePrice;
    //販売状況（true:販売済み、false:未販売）
    private boolean isSold;

    public Product(String name, int purchasePrice, int salePrice) {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.isSold = false;
    }

    //利益を算出
    public int calculateProfit() {
        return salePrice - purchasePrice;
    }

    //商品が売れた時の処理
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
