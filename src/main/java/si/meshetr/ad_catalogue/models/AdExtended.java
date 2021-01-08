package si.meshetr.ad_catalogue.models;


import java.time.LocalDateTime;
import java.util.List;

public class AdExtended {

    AdModel adModel;
    List<Photo> photos;

    public AdExtended(){
        super();
    }

    public AdExtended(AdModel adModel, List<Photo> photos) {
        this.adModel = adModel;
        this.photos = photos;
    }

    public AdModel getAdModel() {
        return adModel;
    }

    public void setAdModel(AdModel adModel) {
        this.adModel = adModel;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}
