public class Main {
    public static void main(String[] args) {
        Product product = new Product("laptop","i7",1235.8,12,"black");
        product.setName("Laptop");

        product.setDescription("Asus Laptop");
        product.setStockQuantity(3);
        product.getId();
        product.setId(3333333);
        product.setKod("123");
        product.setRenk("mor");


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println("Hello world!");
    }
}