import model.Product;
import model.SaleRecord;
import service.SaleService;
import service.SaleServiceImpl;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("PS5", 40000, 55000);

        SaleService saleService = new SaleServiceImpl();
        SaleRecord record = saleService.sell(product);

        System.out.println(record.getSummary());
    }
}
