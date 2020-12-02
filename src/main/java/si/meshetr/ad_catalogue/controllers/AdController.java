package si.meshetr.ad_catalogue.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import si.meshetr.ad_catalogue.models.AdModel;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AdController {
    @GetMapping("/api/v1/ads")
    public List<AdModel> returnsFirst10(){
        ArrayList<AdModel> res = new ArrayList<>();

        res.add(new AdModel(
                "44a30972af64d2614b5ae0e54962d08c",
                "d58e3582afa99040e27b92b13c8f2280",
                "Prvi oglas", "Prodam bukova drva",
                49.90
        ));

        res.add(new AdModel(
                "614b5ae0e54962d08c44a30972af64d2",
                "d58e3582afa9992b13c8f2280040e27b",
                "Kia Sportage 2.0 4x4",
                "Rabljeno vozilo, 123 km\n" +
                "Leto izdelave: 2000.\n" +
                "Lokacija vozila: Loče, Loče",
                9543
        ));

        res.add(new AdModel(
                "2af64d2614b5ae0e54962d044a30978c",
                "d58e0e27b92b13c8f22803582afa9904",
                "Samsung TAB S7", "Prodam nerabljeno tablico Samsung S7 zapakirana. Več info na 040411020",
                749.50
        ));

        res.add(new AdModel(
                "44a30972af64d2614b5ae0e54962d08c",
                "d58e3582afa99040e27b92b13c8f2280",
                "Game Boy Advance link kabel", "Prodajam link kabel za Game Boy Advance/Game Boy Advance SP.\n" +
                "\n" +
                "Kabel deluje perfektno in nima znakov dotrajanosti.",
                5.00
        ));

        return res;
    }
}
