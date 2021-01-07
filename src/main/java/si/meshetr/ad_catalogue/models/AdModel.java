package si.meshetr.ad_catalogue.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="t_ad")
public class AdModel {
    @Id
    private int idAd;

    @Column
    private String idUser;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private double price;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;


    public AdModel() {
        super();
    }

    public AdModel(int idAd, String idUser, String title, String description, double price, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.idAd = idAd;
        this.idUser = idUser;
        this.title = title;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getIdAd() {
        return idAd;
    }

    public void setIdAd(int idAd) {
        this.idAd = idAd;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
