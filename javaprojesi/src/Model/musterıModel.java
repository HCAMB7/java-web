package Model;

public class musteriModel {
    private String musteriID, ad, soyad;

    public musteriModel(String musteriID, String ad, String soyad) {
        this.musteriID = musteriID;
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getMusteriID() {
        return musteriID;
    }

    public void setMusteriID(String musteriID) {
        this.musteriID = musteriID;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}