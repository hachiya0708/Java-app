package service;

import model.Product;
import model.SaleRecord;

import java.time.LocalDate;

public class SaleServiceImpl implements SaleService {

    @Override
    public SaleRecord sell(Product product) {
        if (product.isSold()) {
            throw new IllegalStateException("すでに販売済みの商品です。");
        }

        product.markAsSold();
        return new SaleRecord(product, LocalDate.now());
    }
}
