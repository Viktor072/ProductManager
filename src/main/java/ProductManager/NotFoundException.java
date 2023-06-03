package ProductManager;
public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("Element width id: " + id + " not found");
    }
}
