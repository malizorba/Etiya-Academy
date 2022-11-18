public class Main {
    public static void main(String[] args) {
        ProductManager productManager=new ProductManager();
        Product product=new Product();
        product.price=10;
        product.name="asd";
        productManager.Add(product);

        System.out.println("Hello world!");
        DatabaseHelper.Crud.Delete();
    }
}