package com.trademe.test.models.searchModels;

import java.util.ArrayList;

/**
 * Created by alexanderparra on 18/01/16.
 */
public class Store {
    private String Name;
    private String LogoImageUri;
    private String BannerImageUri;
    private java.util.List<Promotion> Promotions = new ArrayList<Promotion>();

    /**
     *
     * @return
     * The Name
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param Name
     * The Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     *
     * @return
     * The LogoImageUri
     */
    public String getLogoImageUri() {
        return LogoImageUri;
    }

    /**
     *
     * @param LogoImageUri
     * The LogoImageUri
     */
    public void setLogoImageUri(String LogoImageUri) {
        this.LogoImageUri = LogoImageUri;
    }

    /**
     *
     * @return
     * The BannerImageUri
     */
    public String getBannerImageUri() {
        return BannerImageUri;
    }

    /**
     *
     * @param BannerImageUri
     * The BannerImageUri
     */
    public void setBannerImageUri(String BannerImageUri) {
        this.BannerImageUri = BannerImageUri;
    }

    /**
     *
     * @return
     * The Promotions
     */
    public java.util.List<Promotion> getPromotions() {
        return Promotions;
    }

    /**
     *
     * @param Promotions
     * The Promotions
     */
    public void setPromotions(java.util.List<Promotion> Promotions) {
        this.Promotions = Promotions;
    }
}
