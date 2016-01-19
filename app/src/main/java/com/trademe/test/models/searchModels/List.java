package com.trademe.test.models.searchModels;

import java.util.ArrayList;

/**
 * Created by alexanderparra on 18/01/16.
 */
public class List {

    private int ListingId;
    private String Title;
    private String Category;
    private float StartPrice;
    private float BuyNowPrice;
    private String StartDate;
    private String EndDate;
    private boolean IsFeatured;
    private boolean HasGallery;
    private boolean IsBold;
    private boolean IsHighlighted;
    private boolean HasHomePageFeature;
    private float MaxBidAmount;
    private String AsAt;
    private String CategoryPath;
    private String PictureHref;
    private boolean HasPayNow;
    private boolean IsNew;
    private int RegionId;
    private String Region;
    private int SuburbId;
    private String Suburb;
    private int BidCount;
    private boolean IsReserveMet;
    private boolean HasReserve;
    private boolean HasBuyNow;
    private String NoteDate;
    private int ReserveState;
    private boolean IsClassified;
    private java.util.List<OpenHome> OpenHomes = new ArrayList<OpenHome>();
    private String Subtitle;
    private boolean IsBuyNowOnly;
    private int RemainingGalleryPlusRelists;
    private boolean IsOnWatchList;
    private GeographicLocation GeographicLocation;
    private String PriceDisplay;
    private int TotalReviewCount;
    private int PositiveReviewCount;
    private boolean HasFreeShipping;
    private boolean IsClearance;
    private float WasPrice;
    private int PercentageOff;
    private Branding branding;

    /**
     * @return The ListingId
     */
    public int getListingId() {
        return ListingId;
    }

    /**
     * @param ListingId The ListingId
     */
    public void setListingId(int ListingId) {
        this.ListingId = ListingId;
    }

    /**
     * @return The Title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * @param Title The Title
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * @return The Category
     */
    public String getCategory() {
        return Category;
    }

    /**
     * @param Category The Category
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * @return The StartPrice
     */
    public float getStartPrice() {
        return StartPrice;
    }

    /**
     * @param StartPrice The StartPrice
     */
    public void setStartPrice(float StartPrice) {
        this.StartPrice = StartPrice;
    }

    /**
     * @return The BuyNowPrice
     */
    public float getBuyNowPrice() {
        return BuyNowPrice;
    }

    /**
     * @param BuyNowPrice The BuyNowPrice
     */
    public void setBuyNowPrice(float BuyNowPrice) {
        this.BuyNowPrice = BuyNowPrice;
    }

    /**
     * @return The StartDate
     */
    public String getStartDate() {
        return StartDate;
    }

    /**
     * @param StartDate The StartDate
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * @return The EndDate
     */
    public String getEndDate() {
        return EndDate;
    }

    /**
     * @param EndDate The EndDate
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * @return The IsFeatured
     */
    public boolean isIsFeatured() {
        return IsFeatured;
    }

    /**
     * @param IsFeatured The IsFeatured
     */
    public void setIsFeatured(boolean IsFeatured) {
        this.IsFeatured = IsFeatured;
    }

    /**
     * @return The HasGallery
     */
    public boolean isHasGallery() {
        return HasGallery;
    }

    /**
     * @param HasGallery The HasGallery
     */
    public void setHasGallery(boolean HasGallery) {
        this.HasGallery = HasGallery;
    }

    /**
     * @return The IsBold
     */
    public boolean isIsBold() {
        return IsBold;
    }

    /**
     * @param IsBold The IsBold
     */
    public void setIsBold(boolean IsBold) {
        this.IsBold = IsBold;
    }

    /**
     * @return The IsHighlighted
     */
    public boolean isIsHighlighted() {
        return IsHighlighted;
    }

    /**
     * @param IsHighlighted The IsHighlighted
     */
    public void setIsHighlighted(boolean IsHighlighted) {
        this.IsHighlighted = IsHighlighted;
    }

    /**
     * @return The HasHomePageFeature
     */
    public boolean isHasHomePageFeature() {
        return HasHomePageFeature;
    }

    /**
     * @param HasHomePageFeature The HasHomePageFeature
     */
    public void setHasHomePageFeature(boolean HasHomePageFeature) {
        this.HasHomePageFeature = HasHomePageFeature;
    }

    /**
     * @return The MaxBidAmount
     */
    public float getMaxBidAmount() {
        return MaxBidAmount;
    }

    /**
     * @param MaxBidAmount The MaxBidAmount
     */
    public void setMaxBidAmount(float MaxBidAmount) {
        this.MaxBidAmount = MaxBidAmount;
    }

    /**
     * @return The AsAt
     */
    public String getAsAt() {
        return AsAt;
    }

    /**
     * @param AsAt The AsAt
     */
    public void setAsAt(String AsAt) {
        this.AsAt = AsAt;
    }

    /**
     * @return The CategoryPath
     */
    public String getCategoryPath() {
        return CategoryPath;
    }

    /**
     * @param CategoryPath The CategoryPath
     */
    public void setCategoryPath(String CategoryPath) {
        this.CategoryPath = CategoryPath;
    }

    /**
     * @return The PictureHref
     */
    public String getPictureHref() {
        return PictureHref;
    }

    /**
     * @param PictureHref The PictureHref
     */
    public void setPictureHref(String PictureHref) {
        this.PictureHref = PictureHref;
    }

    /**
     * @return The HasPayNow
     */
    public boolean isHasPayNow() {
        return HasPayNow;
    }

    /**
     * @param HasPayNow The HasPayNow
     */
    public void setHasPayNow(boolean HasPayNow) {
        this.HasPayNow = HasPayNow;
    }

    /**
     * @return The IsNew
     */
    public boolean isIsNew() {
        return IsNew;
    }

    /**
     * @param IsNew The IsNew
     */
    public void setIsNew(boolean IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * @return The RegionId
     */
    public int getRegionId() {
        return RegionId;
    }

    /**
     * @param RegionId The RegionId
     */
    public void setRegionId(int RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * @return The Region
     */
    public String getRegion() {
        return Region;
    }

    /**
     * @param Region The Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * @return The SuburbId
     */
    public int getSuburbId() {
        return SuburbId;
    }

    /**
     * @param SuburbId The SuburbId
     */
    public void setSuburbId(int SuburbId) {
        this.SuburbId = SuburbId;
    }

    /**
     * @return The Suburb
     */
    public String getSuburb() {
        return Suburb;
    }

    /**
     * @param Suburb The Suburb
     */
    public void setSuburb(String Suburb) {
        this.Suburb = Suburb;
    }

    /**
     * @return The BidCount
     */
    public int getBidCount() {
        return BidCount;
    }

    /**
     * @param BidCount The BidCount
     */
    public void setBidCount(int BidCount) {
        this.BidCount = BidCount;
    }

    /**
     * @return The IsReserveMet
     */
    public boolean isIsReserveMet() {
        return IsReserveMet;
    }

    /**
     * @param IsReserveMet The IsReserveMet
     */
    public void setIsReserveMet(boolean IsReserveMet) {
        this.IsReserveMet = IsReserveMet;
    }

    /**
     * @return The HasReserve
     */
    public boolean isHasReserve() {
        return HasReserve;
    }

    /**
     * @param HasReserve The HasReserve
     */
    public void setHasReserve(boolean HasReserve) {
        this.HasReserve = HasReserve;
    }

    /**
     * @return The HasBuyNow
     */
    public boolean isHasBuyNow() {
        return HasBuyNow;
    }

    /**
     * @param HasBuyNow The HasBuyNow
     */
    public void setHasBuyNow(boolean HasBuyNow) {
        this.HasBuyNow = HasBuyNow;
    }

    /**
     * @return The NoteDate
     */
    public String getNoteDate() {
        return NoteDate;
    }

    /**
     * @param NoteDate The NoteDate
     */
    public void setNoteDate(String NoteDate) {
        this.NoteDate = NoteDate;
    }

    /**
     * @return The ReserveState
     */
    public int getReserveState() {
        return ReserveState;
    }

    /**
     * @param ReserveState The ReserveState
     */
    public void setReserveState(int ReserveState) {
        this.ReserveState = ReserveState;
    }

    /**
     * @return The IsClassified
     */
    public boolean isIsClassified() {
        return IsClassified;
    }

    /**
     * @param IsClassified The IsClassified
     */
    public void setIsClassified(boolean IsClassified) {
        this.IsClassified = IsClassified;
    }

    /**
     * @return The OpenHomes
     */
    public java.util.List<OpenHome> getOpenHomes() {
        return OpenHomes;
    }

    /**
     * @param OpenHomes The OpenHomes
     */
    public void setOpenHomes(java.util.List<OpenHome> OpenHomes) {
        this.OpenHomes = OpenHomes;
    }

    /**
     * @return The Subtitle
     */
    public String getSubtitle() {
        return Subtitle;
    }

    /**
     * @param Subtitle The Subtitle
     */
    public void setSubtitle(String Subtitle) {
        this.Subtitle = Subtitle;
    }

    /**
     * @return The IsBuyNowOnly
     */
    public boolean isIsBuyNowOnly() {
        return IsBuyNowOnly;
    }

    /**
     * @param IsBuyNowOnly The IsBuyNowOnly
     */
    public void setIsBuyNowOnly(boolean IsBuyNowOnly) {
        this.IsBuyNowOnly = IsBuyNowOnly;
    }

    /**
     * @return The RemainingGalleryPlusRelists
     */
    public int getRemainingGalleryPlusRelists() {
        return RemainingGalleryPlusRelists;
    }

    /**
     * @param RemainingGalleryPlusRelists The RemainingGalleryPlusRelists
     */
    public void setRemainingGalleryPlusRelists(int RemainingGalleryPlusRelists) {
        this.RemainingGalleryPlusRelists = RemainingGalleryPlusRelists;
    }

    /**
     * @return The IsOnWatchList
     */
    public boolean isIsOnWatchList() {
        return IsOnWatchList;
    }

    /**
     * @param IsOnWatchList The IsOnWatchList
     */
    public void setIsOnWatchList(boolean IsOnWatchList) {
        this.IsOnWatchList = IsOnWatchList;
    }

    /**
     * @return The GeographicLocation
     */
    public GeographicLocation getGeographicLocation() {
        return GeographicLocation;
    }

    /**
     * @param GeographicLocation The GeographicLocation
     */
    public void setGeographicLocation(GeographicLocation GeographicLocation) {
        this.GeographicLocation = GeographicLocation;
    }

    /**
     * @return The PriceDisplay
     */
    public String getPriceDisplay() {
        return PriceDisplay;
    }

    /**
     * @param PriceDisplay The PriceDisplay
     */
    public void setPriceDisplay(String PriceDisplay) {
        this.PriceDisplay = PriceDisplay;
    }

    /**
     * @return The TotalReviewCount
     */
    public int getTotalReviewCount() {
        return TotalReviewCount;
    }

    /**
     * @param TotalReviewCount The TotalReviewCount
     */
    public void setTotalReviewCount(int TotalReviewCount) {
        this.TotalReviewCount = TotalReviewCount;
    }

    /**
     * @return The PositiveReviewCount
     */
    public int getPositiveReviewCount() {
        return PositiveReviewCount;
    }

    /**
     * @param PositiveReviewCount The PositiveReviewCount
     */
    public void setPositiveReviewCount(int PositiveReviewCount) {
        this.PositiveReviewCount = PositiveReviewCount;
    }

    /**
     * @return The HasFreeShipping
     */
    public boolean isHasFreeShipping() {
        return HasFreeShipping;
    }

    /**
     * @param HasFreeShipping The HasFreeShipping
     */
    public void setHasFreeShipping(boolean HasFreeShipping) {
        this.HasFreeShipping = HasFreeShipping;
    }

    /**
     * @return The IsClearance
     */
    public boolean isIsClearance() {
        return IsClearance;
    }

    /**
     * @param IsClearance The IsClearance
     */
    public void setIsClearance(boolean IsClearance) {
        this.IsClearance = IsClearance;
    }

    /**
     * @return The WasPrice
     */
    public float getWasPrice() {
        return WasPrice;
    }

    /**
     * @param WasPrice The WasPrice
     */
    public void setWasPrice(float WasPrice) {
        this.WasPrice = WasPrice;
    }

    /**
     * @return The PercentageOff
     */
    public int getPercentageOff() {
        return PercentageOff;
    }

    /**
     * @param PercentageOff The PercentageOff
     */
    public void setPercentageOff(int PercentageOff) {
        this.PercentageOff = PercentageOff;
    }

    /**
     * @return The Branding
     */
    public Branding getBranding() {
        return branding;
    }

    /**
     * @param Branding The Branding
     */
    public void setBranding(Branding Branding) {
        this.branding = Branding;
    }
}
