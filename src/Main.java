import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.IOFilePersistence;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FilePersistence persistence = new IOFilePersistence("user.csv");
        System.out.println("============");
        System.out.println(persistence.write("Diego;diego@email.com;17/07/1997"));
        System.out.println("============");
        System.out.println(persistence.write("Marcia;marcia@email.com;11/01/1990"));
        System.out.println("============");
        System.out.println(persistence.write("Julio;diego@email.com;15/04/2004"));
        System.out.println("============");
        System.out.println(persistence.findAll());
        System.out.println("============");
        System.out.println(persistence.remove("04/2004"));
        System.out.println("============");
        System.out.println(persistence.findBy("Diego"));
        System.out.println("============");
        System.out.println(persistence.findBy("Julio"));
        System.out.println("============");
        System.out.println(persistence.replace("Marcia;", "Romero;brito@email.com;19/09/1999"));
        System.out.println("============");
        System.out.println(persistence.findAll());
        System.out.println("============");
    }
}