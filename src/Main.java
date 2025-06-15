import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.NIOFilePersistence;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FilePersistence persistence = new NIOFilePersistence("user.csv");
        System.out.println(persistence.write("diego;diego@email.com;17/07/1997"));
        System.out.println("=============");
        System.out.println(persistence.write("bernardo;bernardo@email.com;20/02/2002"));
        System.out.println("=============");
        System.out.println(persistence.write("suelen;su@email.com;12/12/1982"));
        System.out.println("=============");
        System.out.println(persistence.findAll());
        System.out.println("=============");
        System.out.println(persistence.findBy("suelen"));
        System.out.println("=============");
        System.out.println(persistence.findBy("/97"));
        System.out.println("=============");
        System.out.println(persistence.remove("bernardo"));
        System.out.println("=============");
        System.out.println(persistence.findAll());
        System.out.println("=============");
        System.out.println(persistence.replace("su@email", "outroteste;teste@email.com;10/10/2010"));
        System.out.println("=============");
        System.out.println(persistence.findAll());
        System.out.println("=============");
    }
}