package si.meshetr.ad_catalogue.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import si.meshetr.ad_catalogue.models.AdModel;
import si.meshetr.ad_catalogue.repos.AdRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class AdController {

    @Autowired
    private AdRepository adRepository;

    @GetMapping("/api/v1/ads")
    public List<AdModel> returnsFirst10(){
        return adRepository.findAll(PageRequest.of(0,10, Sort.by("idAd"))).toList();
    }
}



/*ArrayList<AdModel> res = new ArrayList<>();

        adRepository.save(new AdModel(
                1,
                "d58e3582afa99040e27b92b13c8f2280",
                "Prvi oglas", "Prodam bukova drva",
                49.90,
                LocalDateTime.now(),
                LocalDateTime.now()
        ));

        adRepository.save(new AdModel(
                2,
                "d58e3582afa9992b13c8f2280040e27b",
                "Kia Sportage 2.0 4x4",
                "Rabljeno vozilo, 123 km\n" +
                "Leto izdelave: 2000.\n" +
                "Lokacija vozila: Loče, Loče",
                9543,
                LocalDateTime.now(),
                LocalDateTime.now()
        ));

        adRepository.save(new AdModel(
                3,
                "d58e0e27b92b13c8f22803582afa9904",
                "Samsung TAB S7", "Prodam nerabljeno tablico Samsung S7 zapakirana. Več info na 040411020",
                749.50,
                LocalDateTime.now(),
                LocalDateTime.now()
        ));

        adRepository.save(new AdModel(
                4,
                "d58e3582afa99040e27b92b13c8f2280",
                "Game Boy Advance link kabel", "Prodajam link kabel za Game Boy Advance/Game Boy Advance SP.\n" +
                "\n" +
                "Kabel deluje perfektno in nima znakov dotrajanosti.",
                5.00,
                LocalDateTime.now(),
                LocalDateTime.now()
        ));

        return adRepository.findAll();*/
