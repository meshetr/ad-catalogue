package si.meshetr.ad_catalogue.models;

public class AdModel {
    private String adId;
    private String userId;
    private String title;
    private String description;
    private double price;

    public AdModel(String adId, String userId, String title, String description, double price) {
        this.adId = adId;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
}
