package com.trademe.test.models.searchModels;

/**
 * Created by alexanderparra on 18/01/16.
 */
public class Ad {
    private String Title;
    private String Subtitle;
    private String Details;
    private String AdImageUri;
    private String BrandLogoUri;
    private int ListOffset;
    private String ActionUri;
    private int Action;
    private int ActionListingId;

    /**
     *
     * @return
     * The Title
     */
    public String getTitle() {
        return Title;
    }

    /**
     *
     * @param Title
     * The Title
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     *
     * @return
     * The Subtitle
     */
    public String getSubtitle() {
        return Subtitle;
    }

    /**
     *
     * @param Subtitle
     * The Subtitle
     */
    public void setSubtitle(String Subtitle) {
        this.Subtitle = Subtitle;
    }

    /**
     *
     * @return
     * The Details
     */
    public String getDetails() {
        return Details;
    }

    /**
     *
     * @param Details
     * The Details
     */
    public void setDetails(String Details) {
        this.Details = Details;
    }

    /**
     *
     * @return
     * The AdImageUri
     */
    public String getAdImageUri() {
        return AdImageUri;
    }

    /**
     *
     * @param AdImageUri
     * The AdImageUri
     */
    public void setAdImageUri(String AdImageUri) {
        this.AdImageUri = AdImageUri;
    }

    /**
     *
     * @return
     * The BrandLogoUri
     */
    public String getBrandLogoUri() {
        return BrandLogoUri;
    }

    /**
     *
     * @param BrandLogoUri
     * The BrandLogoUri
     */
    public void setBrandLogoUri(String BrandLogoUri) {
        this.BrandLogoUri = BrandLogoUri;
    }

    /**
     *
     * @return
     * The ListOffset
     */
    public int getListOffset() {
        return ListOffset;
    }

    /**
     *
     * @param ListOffset
     * The ListOffset
     */
    public void setListOffset(int ListOffset) {
        this.ListOffset = ListOffset;
    }

    /**
     *
     * @return
     * The ActionUri
     */
    public String getActionUri() {
        return ActionUri;
    }

    /**
     *
     * @param ActionUri
     * The ActionUri
     */
    public void setActionUri(String ActionUri) {
        this.ActionUri = ActionUri;
    }

    /**
     *
     * @return
     * The Action
     */
    public int getAction() {
        return Action;
    }

    /**
     *
     * @param Action
     * The Action
     */
    public void setAction(int Action) {
        this.Action = Action;
    }

    /**
     *
     * @return
     * The ActionListingId
     */
    public int getActionListingId() {
        return ActionListingId;
    }

    /**
     *
     * @param ActionListingId
     * The ActionListingId
     */
    public void setActionListingId(int ActionListingId) {
        this.ActionListingId = ActionListingId;
    }

}
