package service;

import model.Product;
import model.SaleRecord;

public interface SaleService {
    SaleRecord sell(Product product);
}
