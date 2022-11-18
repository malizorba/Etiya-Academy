public class Main {
    public static void main(String[] args) {
//        BaseLogger [] loggers=new BaseLogger[]{new FileLogger(),new EmailLogger(),new ConsoleLogger(),new EmailLogger()};
//        for (BaseLogger logger: loggers){
//            logger.Log("Log mesajı");
//        }
//        EmailLogger logger=new EmailLogger();
//        logger.Log("Log mesajı");
//        System.out.println("Hello world!");

        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
        customerManager.Add();
    }
}