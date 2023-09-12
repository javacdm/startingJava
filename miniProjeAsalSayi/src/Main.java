public class Main {
    public static void main(String[] args) {
        int number = -2;
        int kalan = number % 2;
        //System.out.println(kalan);
        boolean isPrime = true;
        if(number==1){
            System.out.println("Asal sayı degildir");
            return;
        }
        if(number<1){
            System.out.println("Geçersiz sayı");
            return;
        }
        for (int i=2; i<number;i++){
            if(number %i == 0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("Sayı Asaldır");
        }else{
            System.out.println("Sayı asal degildir");
        }
    }
}