package ProductManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {
    @Test
    public void testRemoveWhenProductExist() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(11, "Смартфон", 30_000);
        Product product2 = new Product(32, "Книга", 3_000);
        Product product3 = new Product(400, "Автомобиль", 8_000_000);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(32);
        Product[] actual = repo.findAll();
        Product[] expected = {product1, product3};


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveWhenProductNotExist() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(11, "Смартфон", 30_000);
        Product product2 = new Product(32, "Книга", 3_000);
        Product product3 = new Product(400, "Автомобиль", 8_000_000);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        Assertions.assertThrows(NotFoundException.class,
                () -> repo.remove(54)
        );
    }

}
