package si.meshetr.ad_catalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdCatalogueApplication {

    public static void main(String[] args) {

        System.out.println(System.getenv("DB_PASS"));

        SpringApplication.run(AdCatalogueApplication.class, args);
    }

}
