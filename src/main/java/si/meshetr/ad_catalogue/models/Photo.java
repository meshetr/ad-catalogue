package si.meshetr.ad_catalogue.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_photo")
public class Photo {

    @Id
    private Long idPhoto;

    @Column
    private long idAd;

    @Column
    private String urlOriginal;

    public Photo() {
        super();
    }

    public Photo(Long idPhoto, long idAd, String urlOriginal) {
        this.idPhoto = idPhoto;
        this.idAd = idAd;
        this.urlOriginal = urlOriginal;
    }

    public Long getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(Long idPhoto) {
        this.idPhoto = idPhoto;
    }

    public long getIdAd() {
        return idAd;
    }

    public void setIdAd(long idAd) {
        this.idAd = idAd;
    }

    public String getUrlOriginal() {
        return urlOriginal;
    }

    public void setUrlOriginal(String urlOriginal) {
        this.urlOriginal = urlOriginal;
    }
}
