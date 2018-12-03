import com.build.Product;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Product product = Product.builder().setName("零吃").build();
        System.out.println(product.getName());
    }
}
