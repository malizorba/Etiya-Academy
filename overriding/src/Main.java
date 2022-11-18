public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers=new BaseKrediManager[]{new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
        for (BaseKrediManager kredimanager:krediManagers) {
            System.out.println(kredimanager.hesapla(1000));

        }
        System.out.println("Hello world!");
    }
}