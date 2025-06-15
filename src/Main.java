import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.NIO2FilePersistence;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FilePersistence persistence = new NIO2FilePersistence("user.csv");
        System.out.println("=========");
        System.out.println(persistence.write("diego;diego@email.com;1997"));
        System.out.println("=========");
        System.out.println(persistence.write("maria;maria@email.com;2000"));
        System.out.println("=========");
        System.out.println(persistence.write("yesmim;yas@email.com;1999"));
        System.out.println("=========");
        System.out.println(persistence.findAll());
        System.out.println("=========");
        System.out.println(persistence.findBy("1999"));
        System.out.println("=========");
        System.out.println(persistence.remove("maria"));
        System.out.println("=========");
        System.out.println(persistence.findAll());
        System.out.println("=========");
        System.out.println(persistence.replace("yesmim", "YASMIM;yas@email.com;1999"));
        System.out.println("=========");
        System.out.println(persistence.findAll());
        System.out.println("=========");
    }
}