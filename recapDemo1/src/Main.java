public class Main {
    public static void main(String[] args) {
        float sayi1=2445;
        float sayi2=23232;
        float sayi3=1685;
        float sayi4=75;

        float enBuyuk=sayi1;
        if(enBuyuk<sayi2) {
            enBuyuk=sayi2;
        }
        if(enBuyuk<sayi3) {
            enBuyuk=sayi3;
        }
        if(enBuyuk<sayi4) {
            enBuyuk=sayi4;
        }
        System.out.println("enbuyuk sayı = "+enBuyuk);
    }

}