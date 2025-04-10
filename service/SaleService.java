package service;

import model.Product;
import model.SaleRecord;

//販売処理
public interface SaleService {
    SaleRecord sell(Product product);
}
