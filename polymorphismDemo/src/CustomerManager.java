import javax.xml.crypto.Data;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;

    }
    public void add(){

        System.out.println("Müsteri eklendi");
        this.logger.log("LOG MESAJİ");

    }
}
