public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranan = 6;
        boolean varmi = false;
        for (int sayi : sayilar) {
            if (sayi == aranan) {
                varmi = true;
                break;


            }
        }
        if(varmi){
            System.out.println("ARANAN SAYI LİSTEDE var");
        }else{
            System.out.println("ARANAN SAYI LİSTEDE YOK");
        }


    }
}