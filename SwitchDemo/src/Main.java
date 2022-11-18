public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Geçtiniz");
                break;
            case 'B':
                System.out.println("İyi ama Geçtiniz");
                break;
            case 'C':
                System.out.println("Orta Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil");
                break;
            default:
                System.out.println("Geçersiz Not girdiniz");

        }
    }
}