public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();
        customerManager.databaseManager=new MySqlDatabase();
        customerManager.getCustomer();
        System.out.println("Hello world!");
    }
}