import model.Product;
import model.SaleRecord;
import service.SaleService;
import service.SaleServiceImpl;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("卵", 200, 350);

        SaleService saleService = new SaleServiceImpl();
        SaleRecord record = saleService.sell(product);

        System.out.println(record.getSummary());
    }
}
