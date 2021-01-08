package si.meshetr.ad_catalogue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdCatalogueApplication {

    static final Logger logger = LogManager.getLogger(AdCatalogueApplication.class.getName());

    public static void main(String[] args) {
        logger.info("App starting");
        SpringApplication.run(AdCatalogueApplication.class, args);
    }

}
