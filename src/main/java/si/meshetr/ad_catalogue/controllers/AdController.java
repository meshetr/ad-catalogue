package si.meshetr.ad_catalogue.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping("catalogue/api/v1/ads")
    public List<AdModel> returnsFirst10(){
        return adRepository.findAll(PageRequest.of(0,10, Sort.by("idAd"))).toList();
    }

    @GetMapping("catalogue/api/v1/ad/{id}")
    public AdExtended returnSpecificAd(@PathVariable("id") long id){

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
}




