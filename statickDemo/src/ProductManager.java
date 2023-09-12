public class ProductManager {
    public void add(Product product){
        ProducktValidator validator = new ProducktValidator();
        if(validator.isValid(product)){
            System.out.println("Eklendi");

        }else {
            System.out.println("Eklenemedi");
        }

    }
}
