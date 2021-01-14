package si.meshetr.ad_catalogue.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import si.meshetr.ad_catalogue.AdCatalogueApplication;
import si.meshetr.ad_catalogue.models.AdExtended;
import si.meshetr.ad_catalogue.models.AdModel;
import si.meshetr.ad_catalogue.models.Photo;
import si.meshetr.ad_catalogue.repos.AdRepository;
import si.meshetr.ad_catalogue.repos.PhotoRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class AdController {

    @Autowired
    private AdRepository adRepository;

    @Autowired
    private PhotoRepository photoRepository;

    static final Logger logger = LogManager.getLogger(AdCatalogueApplication.class.getName());


    @CrossOrigin
    @GetMapping("/catalogue/api/v1/ads")
    public List<AdModel> returnsFirst30(){
        logger.info("General ads requested.");
        return adRepository.findAll(PageRequest.of(0,30, Sort.by("idAd").descending())).toList();
    }


    @CrossOrigin
    @PostMapping(path="/catalogue/api/v1/ad/", consumes = "application/json", produces = "application/json")
    public void postAd(AdModel adModel){
        logger.info(String.format("New ad added. " + adModel.toString()));
    }


    @CrossOrigin
    @GetMapping("/catalogue/api/v1/ad/{id}")
    public AdExtended returnSpecificAd(@PathVariable("id") long id){
        logger.info(String.format("Ad (id: %s) requested.", id+""));

        Optional<AdModel> res = adRepository.findById(id);
        AdExtended adExtended = new AdExtended();
        try {
            adExtended.setAdModel(res.get());
            Photo examplePhoto = new Photo();
            examplePhoto.setIdAd(res.get().getIdAd());
            List<Photo> photos = photoRepository.findAll(Example.of(examplePhoto));
            adExtended.setPhotos(
                    photos
            );
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return adExtended;
    }


    @CrossOrigin
    @PutMapping("/catalogue/api/v1/ad/{id}")
    AdModel replaceEmployee(@RequestBody AdModel newAdModel, @PathVariable Long id) {

        return adRepository.findById(id)
                .map(adModel -> {
                    adModel.setDescription(newAdModel.getDescription());
                    adModel.setPrice(newAdModel.getPrice());
                    adModel.setTitle(newAdModel.getTitle());
                    adModel.setIdUser(newAdModel.getIdUser());
                    return adRepository.save(adModel);
                })
                .orElseGet(() -> {
                    newAdModel.setIdAd(id);
                    return adRepository.save(newAdModel);
                });
    }


    @CrossOrigin
    @DeleteMapping("/catalogue/api/v1/ad/{id}")
    void deleteEmployee(@PathVariable Long id) {
        adRepository.deleteById(id);
    }
}




