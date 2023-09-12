public class Main {
    public static void main(String[] args) {
        char harf='b';

        switch (harf) {
            case'A':
            case'I':
            case'O':
            case'u':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("ince sesli harf");

        }

    }
}