public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        topla(3,5);
        int toplam=topla2(2,3,4,5,6,10);
        System.out.println(toplam);
        ekle();
    }

        public static void ekle(){
        System.out.println("Eklendi");

        }

        public static void sil(){
            System.out.println("Silindi");

        }

        public static void guncelle(){
            System.out.println("Guncellendi");

        }
        public static int topla2(int... sayılar){
        int toplam=0;
            for (int sayi:sayılar) {
                toplam+=sayi;
            }
            return toplam;
        }
        public static int topla(int sayı1,int sayı2) {
            return sayı1 + sayı2;
        }
    public static String sehirVer(){
        return "Ankara";
    }
}