public class Main {
    public static void main(String[] args) {
       KrediUI krediUI=new KrediUI();
       krediUI.KrediHesapla(new OgretmenKrediManager());
       krediUI.KrediHesapla(new AskerKrediManager());

        OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
        ogretmenKrediManager.hesapla();
        TarimKrediManager tarimKrediManager=new TarimKrediManager();
        tarimKrediManager.hesapla();
        System.out.println("Hello world!");
    }
}