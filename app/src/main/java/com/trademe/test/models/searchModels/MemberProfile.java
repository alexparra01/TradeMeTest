package com.trademe.test.models.searchModels;

/**
 * Created by alexanderparra on 18/01/16.
 */
public class MemberProfile {
    private String FirstName;
    private String Occupation;
    private String Biography;
    private String Quote;
    private String Photo;
    private boolean IsEnabled;
    private String DateRemoved;
    private Member Member;
    private int FavouriteId;
    private Store Store;

    /**
     *
     * @return
     * The FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     *
     * @param FirstName
     * The FirstName
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     *
     * @return
     * The Occupation
     */
    public String getOccupation() {
        return Occupation;
    }

    /**
     *
     * @param Occupation
     * The Occupation
     */
    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }

    /**
     *
     * @return
     * The Biography
     */
    public String getBiography() {
        return Biography;
    }

    /**
     *
     * @param Biography
     * The Biography
     */
    public void setBiography(String Biography) {
        this.Biography = Biography;
    }

    /**
     *
     * @return
     * The Quote
     */
    public String getQuote() {
        return Quote;
    }

    /**
     *
     * @param Quote
     * The Quote
     */
    public void setQuote(String Quote) {
        this.Quote = Quote;
    }

    /**
     *
     * @return
     * The Photo
     */
    public String getPhoto() {
        return Photo;
    }

    /**
     *
     * @param Photo
     * The Photo
     */
    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    /**
     *
     * @return
     * The IsEnabled
     */
    public boolean isIsEnabled() {
        return IsEnabled;
    }

    /**
     *
     * @param IsEnabled
     * The IsEnabled
     */
    public void setIsEnabled(boolean IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     *
     * @return
     * The DateRemoved
     */
    public String getDateRemoved() {
        return DateRemoved;
    }

    /**
     *
     * @param DateRemoved
     * The DateRemoved
     */
    public void setDateRemoved(String DateRemoved) {
        this.DateRemoved = DateRemoved;
    }

    /**
     *
     * @return
     * The Member
     */
    public Member getMember() {
        return Member;
    }

    /**
     *
     * @param Member
     * The Member
     */
    public void setMember(Member Member) {
        this.Member = Member;
    }

    /**
     *
     * @return
     * The FavouriteId
     */
    public int getFavouriteId() {
        return FavouriteId;
    }

    /**
     *
     * @param FavouriteId
     * The FavouriteId
     */
    public void setFavouriteId(int FavouriteId) {
        this.FavouriteId = FavouriteId;
    }

    /**
     *
     * @return
     * The Store
     */
    public Store getStore() {
        return Store;
    }

    /**
     *
     * @param Store
     * The Store
     */
    public void setStore(Store Store) {
        this.Store = Store;
    }

}
