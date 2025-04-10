package model;

import java.time.LocalDate;

//せどり状況を記録
public class SaleRecord {
    private Product product;
    private LocalDate dateSold;

    public SaleRecord(Product product, LocalDate dateSold) {
        this.product = product;
        this.dateSold = dateSold;
    }

    public String getSummary() {
        return product.getName() + " を " + dateSold + " に売却。利益: ¥" + product.calculateProfit();
    }
}
